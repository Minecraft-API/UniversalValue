package ninja.universalvalue.value;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import ninja.universalvalue.json.JsonFileReader;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class ValueMapper
{
    public static LinkedHashMap<ItemStack, Integer> valueMap = new LinkedHashMap<ItemStack, Integer>();

    public static void registerValues()
    {
        registerVanillaValues();
    }

    public static int getValue(Item item)
    {
        //|TODO: Complete this method
        return 0;
    }

    public static int getValue(Block block)
    {
        //|TODO: Complete this method
        return 0;
    }

    public static int getValue(ItemStack itemStack)
    {
        //|TODO: Complete this method
        return 0;
    }

    public static void setValue(Item item, int value)
    {
        //|TODO: Complete this method
    }

    public static void setValue(Block block, int value)
    {
        //|TODO: Complete this method
    }

    public static void setValue(ItemStack itemStack, int value)
    {
        //|TODO: Complete this method
    }

    public static void registerVanillaValues()
    {

    }
}
