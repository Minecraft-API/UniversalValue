package ninja.universalvalue.json;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import ninja.universalvalue.reference.JsonResources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class JsonFileReader
{
    public Map<String, Integer> defaultValues = new HashMap<String, Integer>();
    public JsonFileReader jsonFileReader = new JsonFileReader(JsonResources.MAIN_JSON_LOCATION);

    public static void main(String... args) throws IOException
    {
        final JsonFileReader reader = new JsonFileReader(JsonResources.MAIN_JSON_LOCATION);
        System.out.println(reader.getValue("cobblestone"));
    }

    public JsonFileReader(String filename) throws IOException
    {
        InputStream stream = null;
        try
        {
            stream = getClass().getResourceAsStream(filename);
            ObjectMapper mapper = new ObjectMapper();
            final JsonNode result = mapper.readTree(stream);

            for (JsonNode defaultValue : result.path("default-values"))
            {
                defaultValues.put(
                        defaultValue.get("name").asText(),
                        defaultValue.get("value").asInt());
            }
        } finally {
            if (stream != null)
            {
                stream.close();
            }
        }
    }

    public int getValue(String name)
    {
        return defaultValues.get(name);
    }
}
