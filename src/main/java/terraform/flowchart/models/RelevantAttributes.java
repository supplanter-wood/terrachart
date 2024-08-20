package terraform.flowchart.models;

import java.util.List;

public class RelevantAttributes {
    private String resource;
    private List<String> attribute;

    public String getResource() {
        return resource;
    }

    public List<String> getAttribute() {
        return attribute;
    }
}
