package terraform.flowchart.models;

import java.util.List;

import terraform.flowchart.models.Configuration.ProviderConfig;
import terraform.flowchart.models.PlannedValues.resourceValues;

public class PriorState {
    private String format_version;
    private String terraform_version;

    public String getFormatVersion() {
        return format_version;
    }

    public String getTerraformVersion() {
        return terraform_version;
    }

    private ValuesConfig valuesConfig;
    private RootModule rootModule;

    // Getter for 'pvOutputs'
    public ValuesConfig getValuesConfig() {
        return valuesConfig;
    }

    // Getter for 'root_module'
    public RootModule getRootModule() {
        return rootModule;
    }

    public class ValuesConfig {
        private ValuesOutput valuesOutput;
        private RootModule root_module;

        public ValuesOutput getValuesOutput() {
            return valuesOutput;
        }

        public RootModule getRootModule() {
            return root_module;
        }
    }

    public class ValuesOutput {
        private ContainerId containerId;
        private ImageId imageId;
        private Name name;

        // Getter for 'container_id'
        public ContainerId getContainerId() {
            return containerId;
        }

        // Getter for 'image_id'
        public ImageId getImageId() {
            return imageId;
        }

        // Getter for 'name'
        public Name getName() {
            return name;
        }

        public class ContainerId {
            private boolean sensitive;

            // Getter for 'sensitive'
            public boolean isSensitive() {
                return sensitive;
            }
        }

        public class ImageId {
            private boolean sensitive;
            private String type;
            private String value;

            // Getter for 'sensitive'
            public boolean isSensitive() {
                return sensitive;
            }

            // Getter for 'type'
            public String getType() {
                return type;
            }

            // Getter for 'value'
            public String getValue() {
                return value;
            }
        }

        public class Name {
            private boolean sensitive;
            private String type;
            private String value;

            // Getter for 'sensitive'
            public boolean isSensitive() {
                return sensitive;
            }

            // Getter for 'type'
            public String getType() {
                return type;
            }

            // Getter for 'value'
            public String getValue() {
                return value;
            }
        }
    }

    public class RootModule {
        private List<Resource> resources;

        // Getter for 'resources'
        public List<Resource> getResources() {
            return resources;
        }
    }

    public class Resource {
        private String address;
        private String mode;
        private String type;
        private String name;
        private String providerName;
        private int schemaVersion;
        private resourceValues values;
        private SensitiveValues sensitiveValues;

        // Getter for 'address'
        public String getAddress() {
            return address;
        }

        // Getter for 'mode'
        public String getMode() {
            return mode;
        }

        // Getter for 'type'
        public String getType() {
            return type;
        }

        // Getter for 'name'
        public String getName() {
            return name;
        }

        // Getter for 'provider_name'
        public String getProviderName() {
            return providerName;
        }

        // Getter for 'schema_version'
        public int getSchemaVersion() {
            return schemaVersion;
        }

        // Getter for 'values'
        public resourceValues getValues() {
            return values;
        }

        // Getter for 'sensitive_values'
        public SensitiveValues getSensitiveValues() {
            return sensitiveValues;
        }
    }

    public class SensitiveValues {
        private Object build;

        private Object getBuild() {
            return build;
        }

    }
}
