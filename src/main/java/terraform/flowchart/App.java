package terraform.flowchart;

import terraform.flowchart.models.TerraformPlan;
import terraform.flowchart.utils.JSONRetrieval.RelevantRetrieval;
import terraform.flowchart.utils.JSONRetrieval.RootRetrieval;
import terraform.flowchart.utils.JSONUtils;

// Will have to decide which classes are necessary // remove duplicates
// Case sensitive variable names are important when accessing JSON arrays
// Modularise common models

public class App {
    public static void main(String[] args) {
        // RR information
        RelevantRetrieval rr = new RelevantRetrieval(); // TerraformPlan -> RootRetrieval -> RelevantAttributes ->
                                                        // RelevantRetrieval
        TerraformPlan globalRoot = RootRetrieval.TerraformPlan();
        JSONUtils.getAllData(globalRoot);
    }

}

// public DataModel getDataById(int id) {
// return dataList.stream()
// .filter(data -> data.getId() == id)
// .findFirst()
// .orElse(null);
// }