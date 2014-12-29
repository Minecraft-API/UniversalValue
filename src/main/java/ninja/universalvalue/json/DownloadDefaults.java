package ninja.universalvalue.json;

import ninja.universalvalue.reference.JsonResources;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class DownloadDefaults
{
    public static void downloadDefault()
    {
        try
        {
            org.apache.commons.io.FileUtils.copyURLToFile(new URL("https://raw.githubusercontent.com/Minecraft-API/UniversalValue/master/src/main/resources/assets/universalvalue/json/default.json"), new File(JsonResources.MAIN_JSON_LOCATION));
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
