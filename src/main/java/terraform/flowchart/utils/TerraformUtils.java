package terraform.flowchart.utils;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import terraform.flowchart.models.Configuration;
import terraform.flowchart.models.PlannedValues;
import terraform.flowchart.models.ResourceDrift;
import terraform.flowchart.models.StartingValues;
import terraform.flowchart.models.TerraformPlan;
import terraform.flowchart.models.ResourceChange;

import com.google.gson.GsonBuilder;

public class TerraformUtils {

    public TerraformUtils() {

    }

    public static StartingValues jsonInputToTerraformResource(String input) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        StartingValues book = gson.fromJson(input, StartingValues.class);
        return book;
    }

    public static TerraformPlan foundationPlan(String input) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        TerraformPlan tfPlan = gson.fromJson(input, TerraformPlan.class);
        return tfPlan;
    }

    public static Configuration configPlan(String input) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        Configuration tfPlan = gson.fromJson(input, new TypeToken<Configuration>() {
        }.getType());
        return tfPlan;
    }

    public static PlannedValues configPlanned(String input) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        PlannedValues tfPlan = gson.fromJson(input, new TypeToken<PlannedValues>() {
        }.getType());
        return tfPlan;
    }

    public static ResourceDrift configDrift(String input) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        ResourceDrift tfDrift = gson.fromJson(input, new TypeToken<ResourceDrift>() {
        }.getType());
        return tfDrift;
    }

    public static ResourceChange configChange(String input) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        ResourceChange tfChange = gson.fromJson(input, new TypeToken<ResourceChange>() {

        }.getType());
        return tfChange;
    }

}
