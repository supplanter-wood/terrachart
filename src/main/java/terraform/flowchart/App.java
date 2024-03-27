package terraform.flowchart;

import com.google.gson.*;

import java.io.IOException;
import java.util.List;
import java.io.InputStream;
import java.util.Objects;

import terraform.flowchart.models.Configuration;
import terraform.flowchart.models.PlannedValues;
import terraform.flowchart.models.ResourceDrift;
import terraform.flowchart.utils.TerraformUtils;

import terraform.flowchart.models.Configuration.ConfigurationValues;
import terraform.flowchart.models.Configuration.DockerConfig;
import terraform.flowchart.models.Configuration.ProviderConfig;
import terraform.flowchart.models.Configuration.RootModule;
import terraform.flowchart.models.Configuration.RootModule.Resource;
import terraform.flowchart.models.PlannedValues.PlannedRoot;
import terraform.flowchart.models.ResourceChange.ResourceChangeSection;
import terraform.flowchart.models.ResourceDrift.ResourceDriftValues;
import terraform.flowchart.models.ResourceChange;

// Will have to decide which classes are necessary // remove duplicates
// Case sensitive variable names are important when accessing JSON arrays
// Modularise common models

public class App {
    public static void main(String[] args) {

        try {
            String fileName = "terraform.json";
            String content = readResourceAsString(fileName);

            // startingPlan(content);
            // configurationSection(content);
            // plannedValuesSection(content);
            // resourceDriftSection(content);
            resourceChangeSection(content);
            // bosh(content);

            // System.out.println("Name: " + dConfig.getName());
            // System.out.println("Full name: " + dConfig.getFullName());
            // System.out.println("Version Constraint: " + dConfig.getVersionConstraint());
            // System.out.println("Ports: " + ports.get(0) + ports.get(1));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void configurationSection(String content) {
        Configuration tfOutput = TerraformUtils.configPlan(content);
        ConfigurationValues cValues = tfOutput.getConfiguration();

        ProviderConfig pConfig = cValues.getProviderConfig();
        DockerConfig dConfig = pConfig.getDocker();

        RootModule rModule = cValues.getRootModule();
        List<Resource> cResources = rModule.getResources();

        // Provider Config accuracy test - Tick
        System.out.println("Docker Name: " + dConfig.getName());
        System.out.println("Docker Full Name: " + dConfig.getFullName());
        System.out.println("Docker Version Constraint: " + dConfig.getVersionConstraint());

        // Root Module accuracy test - tick
        System.out.println("Outputs/container_id/expression/references: "
                + rModule.getOutputs().getContainerID().getExpression().getImage());
        System.out.println("../../description" + rModule.getOutputs().getContainerID().getDescription());

        System.out.println("Outputs/image_id/expression/references"
                + rModule.getOutputs().getImageID().getExpression().getImage());
        System.out.println("../../description: " + rModule.getOutputs().getImageID().getDescription());

        // Root Module / resources

    }

    private static void plannedValuesSection(String content) {
        PlannedValues tfOutput = TerraformUtils.configPlanned(content);
        PlannedRoot plannedRoot = tfOutput.getConfiguration();
    }

    private static void resourceDriftSection(String content) {
        ResourceDrift tfDrift = TerraformUtils.configDrift(content);
        List<ResourceDriftValues> rdValues = tfDrift.getConfiguration();
    }

    private static void resourceChangeSection(String content) {
        ResourceChange tfChange = TerraformUtils.configChange(content);
        List<ResourceChangeSection> rcValues = tfChange.getConfiguration();
    }

    // private static void startingPlan(String content) {
    // StartingValues jsonOutput =
    // TerraformUtils.jsonInputToTerraformResource(content);
    // StartingValues.PlannedValues planned_values = jsonOutput.getPlannedValues();
    // StartingValues.PlannedValues.Outputs outputs = planned_values.getOutputs();
    // StartingValues.PlannedValues.Outputs.Name name = outputs.getName();
    // System.out.println("Format Version: " + jsonOutput.getFormatVersion());
    // System.out.println("Terraform Version: " + jsonOutput.getTerraformVersion());
    // System.out.println("Docker Container Name: " + name.getValue());
    // }

    private static String readResourceAsString(String fileName) throws IOException {
        ClassLoader classLoader = App.class.getClassLoader();
        try (InputStream inputStream = Objects.requireNonNull(classLoader.getResourceAsStream(fileName))) {
            if (inputStream == null) {
                throw new IOException("File not found: " + fileName);
            }
            byte[] bytes = inputStream.readAllBytes();
            return new String(bytes);
        }
    }

    public static void bosh(String content) {
        {
            Gson gson = new Gson();
            Configuration configuration = gson.fromJson(content, Configuration.class);
            ConfigurationValues configV = configuration.getConfiguration();

            // Now you can access the configuration object and its properties
            // For example:
            System.out.println("Provider Name: " + configV.getProviderConfig().getDocker().getName());
            System.out.println("Output Description: "
                    + configV.getRootModule().getOutputs().getContainerID().getDescription());
        }
    }

}
