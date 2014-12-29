package ninja.universalvalue;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import ninja.universalvalue.json.DownloadDefaults;
import ninja.universalvalue.json.JsonFileReader;
import ninja.universalvalue.reference.JsonResources;
import ninja.universalvalue.util.UVLogger;
import ninja.universalvalue.value.ValueMapper;

import java.net.URL;

import static ninja.universalvalue.UVMod.*;

@Mod(modid = MOD_ID, name = MOD_NAME, version = MOD_VERSION)
public class UVMod
{
    public static final String MOD_ID = "universalvalue";
    public static final String MOD_NAME = "UniversalValue";
    public static final String MOD_VERSION = "@VERSION@";

    @Mod.Instance(MOD_ID)
    public static UVMod instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        UVLogger.info("Downloading default JSON files!");
        DownloadDefaults.downloadDefault();
        ValueMapper.registerValues();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
