import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class JsonFileReaderWriter {
    public static JSONObject readJsonFile(String path) {
        JSONParser parser = new JSONParser();
        JSONObject jsonObject = null;
        try {
            FileReader reader = new FileReader(path);
            Object obj = parser.parse(reader);
            jsonObject = (JSONObject) obj;
            reader.close();
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
        return jsonObject;
    }
    public static void writeJsonFile(String path, JSONObject jsonObject) {
        try {
            FileWriter fileWriter = new FileWriter(path);
            fileWriter.write(jsonObject.toJSONString());
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
