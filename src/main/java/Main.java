import org.json.simple.JSONObject;

import java.io.IOException;


public class Main {
    public static void main(String[] args) {
        String path = "data/test.json";
        JsonFileReaderWriter readerWriter = new JsonFileReaderWriter();
        JSONObject jsonObject = readerWriter.readJsonFile(path);


        jsonObject.put("name: ", "Pavel");
        jsonObject.put("age: ", "30");

        readerWriter.writeJsonFile(path, jsonObject);
        System.out.println(jsonObject);
    }
}
