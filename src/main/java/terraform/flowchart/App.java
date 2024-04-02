package terraform.flowchart;

import java.io.IOException;
import terraform.flowchart.models.TerraformPlan;
import terraform.flowchart.utils.TerraformUtils;

// Will have to decide which classes are necessary // remove duplicates
// Case sensitive variable names are important when accessing JSON arrays
// Modularise common models

public class App {
    public static void main(String[] args) {

        try {
            String fileName = "terraform.json";
            String content = TerraformUtils.readResourceAsString(fileName);

            terraformPlanTest(content);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void terraformPlanTest(String content) {
        TerraformPlan tfRoot = TerraformUtils.foundationPlan(content);
        tfRoot.getConfiguration();
    }

}
