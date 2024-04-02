package terraform.flowchart.models;

import java.util.List;




public class TerraformPlan {

        String timestamp;
        boolean errored;
        String format_version;
        String terraform_version;


        PlannedValues planned_values = new PlannedValues();
        Configuration configuration = new Configuration();
        PriorState prior_state = new PriorState();
        List<ResourceChange> resource_changes;
        List<ResourceDrift> resource_drift;
        OutputChanges output_changes = new OutputChanges();
        List<RelevantAttributes> relevant_attributes;


        public PlannedValues getPlannedValues() {
            return planned_values;
        }

        public Configuration getConfiguration() {
            return configuration;
        }

        public PriorState getPriorState() {
            return prior_state;
        }

        public List<ResourceChange> getResourceChange() {
            return resource_changes;
        }

        public List<ResourceDrift> getResourceDrift() {
            return resource_drift;
        }

        public List<RelevantAttributes> getRelevantAttributes() {
            return relevant_attributes;
        }

        public OutputChanges getOutputChanges() {
            return output_changes;
        }

        public String getTimestamp() {
            return timestamp;
        }

        public boolean getErrored() {
            return errored;
        }

        public String getFormatVersion() {
            return format_version;
        }

        public String getTerraformVersion() {
            return terraform_version;
        }
    }


