package net.su.common.items;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.su.client.gui.GuiRun;

public class Book extends Item {
	public ItemStack onItemRightClick(ItemStack item, World world, EntityPlayer player) {
		Minecraft.getMinecraft().displayGuiScreen(new GuiRun());
	
		return super.onItemRightClick(item, world, player);
	}
}
