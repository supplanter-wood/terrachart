package terraform.flowchart.utils.JSONRetrieval;

import java.io.IOException;

import terraform.flowchart.utils.TerraformUtils;
import terraform.flowchart.models.TerraformPlan;

public class RootRetrieval {

    private static String jsonOutput() {
        try {
            String filename = "terraform.json";
            String content = TerraformUtils.readResourceAsString(filename);
            return content;
        } catch (IOException e) {
            e.printStackTrace();
            return "Error occurred: " + e.getMessage();
        }
    }

    public static TerraformPlan TerraformPlan() {
        String content = jsonOutput();
        TerraformPlan tfRoot = TerraformUtils.rootPlan(content);
        return tfRoot;
    }
}
