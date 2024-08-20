package terraform.flowchart.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

import com.google.gson.Gson;
import terraform.flowchart.App;
import terraform.flowchart.models.TerraformPlan;

import com.google.gson.GsonBuilder;

public class TerraformUtils {

    public TerraformUtils() {

    }

    public static TerraformPlan rootPlan(String input) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        TerraformPlan tfPlan = gson.fromJson(input, TerraformPlan.class);
        return tfPlan;
    }

    public static String readResourceAsString(String fileName) throws IOException {
        ClassLoader classLoader = App.class.getClassLoader();
        try (InputStream inputStream = Objects.requireNonNull(classLoader.getResourceAsStream(fileName))) {
            if (inputStream == null) {
                throw new IOException("File not found: " + fileName);
            }
            byte[] bytes = inputStream.readAllBytes();
            return new String(bytes);
        }
    }

}
