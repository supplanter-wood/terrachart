package terraform.flowchart.models;

import java.util.List;
import java.util.Map;

import terraform.flowchart.models.PlannedValues.ResourcePort;

public class TerraformPlan {
    private String format_version;
    private String terraform_version;
    private PlannedValues planned_values;
    private List<ResourceDrift> resource_drift;
    private List<ResourceChange> resource_changes;
    private Map<String, OutputChange> output_changes;
    private PriorState prior_state;
    private Configuration configuration;
    private List<RelevantAttribute> relevant_attributes;
    private String timestamp;
    private boolean errored;

    // Constructors, getters, setters...

    public String getFormatVersion() {
        return format_version;
    }

    public String getTerraformVersion() {
        return terraform_version;
    }

    public PlannedValues getPlannedValues() {
        return planned_values;
    }

    public List<ResourceDrift> getResourceDrift() {
        return resource_drift;
    }

    public List<ResourceChange> getResourceChanges() {
        return resource_changes;
    }

    public Map<String, OutputChange> getOutputChanges() {
        return output_changes;
    }

    public PriorState getPriorState() {
        return prior_state;
    }

    public Configuration getConfiguration() {
        return configuration;
    }

    public List<RelevantAttribute> getRelevantAttributes() {
        return relevant_attributes;
    }

    public String getTimestamp() {
        return timestamp;

    }

    public boolean isErrored() {
        return errored;
    }

    public class SensitiveValues {
        private List<String> capabilities;
        private List<String> command;
        private List<String> devices;
        private List<String> entrypoint;
        private List<String> env;
        private List<String> healthcheck;
        private List<String> host;
        private List<String> labels;
        private List<String> mounts;
        private List<String> networkData;
        private List<String> networksAdvanced;
        private List<Map<String, ResourcePort>> ports;
        private List<String> securityOpts;
        private List<String> ulimit;
        private List<String> upload;
        private List<String> volumes;

        public List<String> getCapabilities() {
            return capabilities;
        }

        public List<String> getCommand() {
            return command;
        }

        public List<String> getDevices() {
            return devices;
        }

        public List<String> getEntrypoint() {
            return entrypoint;
        }

        public List<String> getEnv() {
            return env;
        }

        public List<String> getHealthcheck() {
            return healthcheck;
        }

        public List<String> getHost() {
            return host;
        }

        public List<String> getLabels() {
            return labels;
        }

        public List<String> getMounts() {
            return mounts;
        }

        public List<String> getNetworkData() {
            return networkData;
        }

        public List<String> getNetworksAdvanced() {
            return networksAdvanced;
        }

        public List<Map<String, ResourcePort>> getPorts() {
            return ports;
        }

        public List<String> getSecurityOpts() {
            return securityOpts;
        }

        public List<String> getUlimit() {
            return ulimit;
        }

        public List<String> getUpload() {
            return upload;
        }

        public List<String> getVolumes() {
            return volumes;
        }
    }

}
