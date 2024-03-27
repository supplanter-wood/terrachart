package terraform.flowchart.models;

import java.util.Map;

public class TerraformResource {
    private String type;
    private String name;
    private Map<String, Object> attributes;

    // Constructors
    public TerraformResource() {
        // Default constructor
    }

    public TerraformResource(String type, String name, Map<String, Object> attributes) {
        this.type = type;
        this.name = name;
        this.attributes = attributes;
    }

    // Getters and Setters
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, Object> getAttributes() {
        return attributes;
    }

    public void setAttributes(Map<String, Object> attributes) {
        this.attributes = attributes;
    }

    // Additional methods if needed...
}

