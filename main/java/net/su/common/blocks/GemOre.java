package net.su.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;

public class GemOre extends Block {

	public GemOre() {		
		super(Material.rock);
		this.setHardness(50F);
		this.setResistance(6000F);
		this.setHarvestLevel("pickaxe", 3);
		
		
	}
	

	
	
	public boolean hasEffect(ItemStack itemstack)
	{
	    return true;
	}
	
	
	
}
