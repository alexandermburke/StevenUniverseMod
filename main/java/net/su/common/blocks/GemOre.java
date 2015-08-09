package net.su.common.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.su.common.items.ModItems;

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
	
	 public Item getItemDropped(int p_149650_1_, Random random, int p_149650_3_)
	    {
	        return ModItems.ingot;
	    }
	 public int quantityDropped(Random random)
	    {
	        return random.nextInt(1) + 9;
	    }
	
	
}
