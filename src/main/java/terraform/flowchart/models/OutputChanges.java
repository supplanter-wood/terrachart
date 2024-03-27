package terraform.flowchart.models;

import java.util.List;

public class OutputChanges {

    private OutputValues output;

    public OutputValues getOutputValues() {
        return output;
    }

    public class OutputValues {
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
            private List<String> actions;
            private String before;
            private boolean after_unknown;
            private boolean before_sensitive;
            private boolean after_sensitive;

            public String before() {
                return before;
            }

            public List<String> getActions() {
                return actions;
            }

            public boolean isAfterUnknown() {
                return after_unknown;
            }

            public boolean isBeforeSensitive() {
                return before_sensitive;
            }

            public boolean after_sensitive() {
                return after_sensitive;
            }

        }

        public class ImageId {
            private String before;
            private String after;
            private List<String> actions;
            private boolean after_unknown;
            private boolean before_sensitive;
            private boolean after_sensitive;

            public String getBefore() {
                return before;
            }

            public String getAfter() {
                return after;
            }

            public List<String> getActions() {
                return actions;
            }

            public boolean isAfterUnknown() {
                return after_unknown;
            }

            public boolean isBeforeSensitive() {
                return before_sensitive;
            }

            public boolean after_sensitive() {
                return after_sensitive;
            }
        }

        public class Name {
            private String before;
            private String after;
            private List<String> actions;
            private boolean after_unknown;
            private boolean before_sensitive;
            private boolean after_sensitive;

            public String getBefore() {
                return before;
            }

            public String getAfter() {
                return after;
            }

            public List<String> getActions() {
                return actions;
            }

            public boolean isAfterUnknown() {
                return after_unknown;
            }

            public boolean isBeforeSensitive() {
                return before_sensitive;
            }

            public boolean after_sensitive() {
                return after_sensitive;
            }
        }
    }
}
