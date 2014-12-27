package ninja.universalvalue.util;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class UVUtilities
{
    public static ItemStack getStackFromString(String name, int meta)
    {
        Item item = (Item) Item.itemRegistry.getObject(name);
        if (item == null)
        {
            return null;
        }
        return new ItemStack(item, 1, meta);
    }
}
