package terraform.flowchart.utils.JSONRetrieval;

import java.util.ArrayList;
import java.util.List;
import terraform.flowchart.models.TerraformPlan;
import terraform.flowchart.models.minorModels.DataRetriever;
import terraform.flowchart.models.RelevantAttributes;

public class RelevantRetrieval {
    public TerraformPlan globalRoot = RootRetrieval.TerraformPlan();

    // Relevant Attributes
    List<RelevantAttributes> tfAttributes = globalRoot.getRelevantAttributes(); // Grabs RelevantAttributes section from
                                                                                // file
    DataRetriever<RelevantAttributes> relevantAttribute = new DataRetriever<>(tfAttributes); // Uses generalised List handler to access RA objects

    public RelevantAttributes getRelevantAttributes(int index) {
        return relevantAttribute.getData(index);
    }


}
