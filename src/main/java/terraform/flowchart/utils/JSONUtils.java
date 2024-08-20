package terraform.flowchart.utils;

import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import terraform.flowchart.models.PlannedValues;
import terraform.flowchart.models.RelevantAttributes;
import terraform.flowchart.models.ResourceChange;
import terraform.flowchart.models.ResourceDrift;
import terraform.flowchart.models.TerraformPlan;
import terraform.flowchart.models.minorModels.DataRetriever;
import terraform.flowchart.utils.JSONRetrieval.RootRetrieval;

import java.util.List;

public class JSONUtils {
    public TerraformPlan globalRoot = RootRetrieval.TerraformPlan();

    public static String getAllData(TerraformPlan tp) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(tp);
        System.out.println(json);
        return json;
    }

    // Serialises PlannedValues into JSON
    public String plannedValuesToJSON(PlannedValues pv) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(pv);
        System.out.println(json);
        return json;
    }

    public String relevantAttributesToJSON(List<RelevantAttributes> ra) {
        List<RelevantAttributes> tfAttributes = globalRoot.getRelevantAttributes();
        DataRetriever<RelevantAttributes> relevantAttribute = new DataRetriever<>(tfAttributes);
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(tfAttributes);
        System.out.println(json);
        return json;
    }

    // public String resourceChangeToJSON(ResourceChange rc) {

    // }

    // public String resourceDriftToJSON(ResourceDrift rd) {

    // }

}
