package ninja.universalvalue.event;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import ninja.universalvalue.json.JsonFileReader;

@SideOnly(Side.CLIENT)
public class ToolTipEvent 
{
    @SubscribeEvent
    public void tTipEvent(ItemTooltipEvent event)
    {
        ItemStack tipStack = event.itemStack;
        Item tipItem = event.itemStack.getItem();
        Block tipBlock = Block.getBlockFromItem(event.itemStack.getItem());

        event.toolTip.add("UV: ");
    }
}
