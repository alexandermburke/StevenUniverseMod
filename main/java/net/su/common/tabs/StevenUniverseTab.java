package net.su.common.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.su.common.items.ModItems;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class StevenUniverseTab extends CreativeTabs{

	public StevenUniverseTab(String label) {
	
		super(label);
	
	
	}
    
    
 
    @Override
	@SideOnly(Side.CLIENT)
    public Item getTabIconItem() {
 
        return ModItems.a;
    }
}