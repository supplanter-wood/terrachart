package terraform.flowchart.models;

import com.google.gson.annotations.SerializedName;

public class StartingValues {
    private String format_version;
    private String terraform_version;
    private PlannedValues planned_values;

    public String getFormatVersion() {
        return format_version;
    }

    @SerializedName("terraform_version")
    public String getTerraformVersion() {
        return terraform_version;
    }

    @SerializedName("planned_values")
    public PlannedValues getPlannedValues() {
        return planned_values;
    }

    public class PlannedValues {
        private Outputs outputs;

        // Getter for 'outputs'
        @SerializedName("outputs")
        public Outputs getOutputs() {
            return outputs;
        }

        public class Outputs {
            private ContainerId containerId;
            private ImageId imageId;
            private Name name;

            // Getter for 'container_id'
            @SerializedName("container_id")
            public ContainerId getContainerId() {
                return containerId;
            }

            // Getter for 'image_id'
            @SerializedName("image_id")
            public ImageId getImageId() {
                return imageId;
            }

            // Getter for 'name'
            @SerializedName("name")
            public Name getName() {
                return name;
            }

            public class ContainerId {
                private boolean sensitive;

                // Getter for 'sensitive'
                @SerializedName("sensitive")
                public boolean isSensitive() {
                    return sensitive;
                }
            }

            public class ImageId {
                private boolean sensitive;
                private String type;
                private String value;

                // Getter for 'sensitive'
                @SerializedName("sensitive")
                public boolean isSensitive() {
                    return sensitive;
                }

                // Getter for 'type'
                @SerializedName("type")
                public String getType() {
                    return type;
                }

                // Getter for 'value'
                @SerializedName("value")
                public String getValue() {
                    return value;
                }
            }

            public class Name {
                private boolean sensitive;
                private String type;
                private String value;

                // Getter for 'sensitive'
                @SerializedName("sensitive")
                public boolean isSensitive() {
                    return sensitive;
                }

                // Getter for 'type'
                @SerializedName("type")
                public String getType() {
                    return type;
                }

                // Getter for 'value'
                public String getValue() {
                    return value;
                }
            }
        }
    }
}
