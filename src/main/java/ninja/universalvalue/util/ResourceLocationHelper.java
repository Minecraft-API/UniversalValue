package ninja.universalvalue.util;

import net.minecraft.util.ResourceLocation;
import ninja.universalvalue.UVMod;

public class ResourceLocationHelper
{
    public static ResourceLocation getResourceLocation(String modId, String path)
    {
        return new ResourceLocation(modId, path);
    }
    public static ResourceLocation getResourceLocation(String path)
    {
        return getResourceLocation(UVMod.MOD_ID.toLowerCase(), path);
    }
}
