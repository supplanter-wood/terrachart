#!/bin/bash

# Check if the correct number of arguments is provided
if [ "$#" -ne 1 ]; then
    echo "Usage: $0 <path_to_terraform_config>"
    exit 1
fi

# Extract the file name and directory
FILE_PATH="$1"
DIRECTORY=$(dirname "$FILE_PATH")

# Navigate to the Terraform configuration directory
cd "$DIRECTORY" || exit

# Run the terraform init
terraform init || exit 1

# Run the terraform plan to capture the plan in tfplan file
terraform plan -out=tfplan || exit 1

# Run the terraform show -json using the tfplan file
terraform show -json tfplan > "terraform.json" || exit 1

# Move the generated JSON file to the source directory
mv "terraform.json" src/main/resources/

# Clean up the tfplan file
rm tfplan