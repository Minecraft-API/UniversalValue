package ninja.universalvalue.reference;

import net.minecraft.util.ResourceLocation;
import ninja.universalvalue.util.ResourceLocationHelper;

public class JsonResources
{
    public static final String MAIN_JSON_LOCATION = "json/";
    public static final ResourceLocation MAIN_JSON = ResourceLocationHelper.getResourceLocation(MAIN_JSON_LOCATION);

    public static final String OREDICT_JSON_LOCATION = MAIN_JSON_LOCATION + "oredictionary/";
    public static final ResourceLocation OREDICT_JSON = ResourceLocationHelper.getResourceLocation(OREDICT_JSON_LOCATION);
}
