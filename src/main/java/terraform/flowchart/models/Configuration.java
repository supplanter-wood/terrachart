package terraform.flowchart.models;

import java.util.List;

    

public class Configuration {

        private ProviderConfig provider_config;
        private RootModule root_module;

        public ProviderConfig getProviderConfig() {
            return provider_config;
        }

        public RootModule getRootModule() {
            return root_module;
        }
    

    public static class ProviderConfig {

        private DockerConfig docker;

        public DockerConfig getDocker() {
            return docker;
        }
    }

    public static class DockerConfig {

        private String name;
        private String full_name;
        private String version_constraint;

        public String getName() {
            return name;
        }

        public String getFullName() {
            return full_name;
        }

        public String getVersionConstraint() {
            return version_constraint;
        }
    }

    public static class RootModule {

        private Outputs outputs;
        private List<Resource> resources;

        public Outputs getOutputs() {
            return outputs;
        }

        public List<Resource> getResources() {
            return resources;
        }

        public static class Outputs {

            private OutputInfo container_id;
            private OutputInfo image_id;
            private OutputInfo name;

            public OutputInfo getContainerID() {
                return container_id;
            }

            public OutputInfo getImageID() {
                return image_id;
            }

            public OutputInfo getName() {
                return name;
            }
        }

        public static class OutputInfo {

            private Expression expression;
            private String description;

            public Expression getExpression() {
                return expression;
            }

            public String getDescription() {
                return description;
            }
        }

        public static class Expression {

            private List<Port> ports;
            private List<String> references;
            private Image image;
            private StringValueRetriever name;
            private BooleanValueRetriever keep_locally;

            public StringValueRetriever getString() {
                return name;
            }

            public BooleanValueRetriever getBoolean() {
                return keep_locally;
            }

            public Image getImage() {
                return image;
            }

            public List<String> getReferences() {
                return references;
            }

            public List<Port> getPorts() {
                return ports;
            }
        }

        public static class StringValueRetriever {

            private String constant_value;

            public String getConstantValue() {
                return constant_value;
            }
        }

        public static class BooleanValueRetriever {

            private String constant_value;

            public String getConstantValue() {
                return constant_value;
            }
        }

        public static class Image {

            private List<String> references;

            public List<String> getReferences() {
                return references;
            }
        }

        public static class Port {

            private PortValue external;
            private PortValue internal;

            public PortValue getExternal() {
                return external;
            }

            public PortValue getInternal() {
                return internal;
            }
        }

        public static class PortValue {

            private String constant_value;

            public String getConstantValue() {
                return constant_value;
            }
        }

        public static class Resource {

            private String address;
            private String mode;
            private String type;
            private String name;
            private String provider_config_key;
            private Expression expressions;
            private int schema_version;

            public String getAddress() {
                return address;
            }

            public String getMode() {
                return mode;
            }

            public String getType() {
                return type;
            }

            public String getName() {
                return name;
            }

            public String getProviderConfigKey() {
                return provider_config_key;
            }

            public Expression getExpressions() {
                return expressions;
            }

            public int getSchemaVersion() {
                return schema_version;
            }
        }
    }
}