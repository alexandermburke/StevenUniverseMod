package net.su.common.items;

import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.su.common.blocks.GemOre;
import net.su.common.main.StevenUniverseMod;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems {
	public static void init(){
		register();
		registerRecipes();
		addSmelting();
	}
	
	public static Item a;
	public static Item b;
	public static Item c;
	public static Item d;
	public static Item e;
	public static Item f;
	public static Item g;
	public static Block BlockA;
	
	
	public static void register()
	{
	
		
		a = new Amythist();
		
		b = new Steven();
		
		c = new Donut(20, false);
		
		d = new TheItem();
		
		e = new TheItem();
		
		f = new TheItem();
		
		g = new Pearl();
		
		registerTheItem(a, "gem1");
		registerTheItem(b, "gem2");
		registerTheItem(c, "donut");
		registerTheItem(d, "gem3");
		registerTheItem(e, "gem4");
		registerTheItem(g, "gem5");
		registerTheItem(f, "lapis");
		
		BlockA = new GemOre();
		
		registerBlock(BlockA, "gem_ore");
		
	}
	
	
	
	
	public static void registerRecipes()
	{
		GameRegistry.addRecipe(new ItemStack(ModItems.BlockA, 1), new Object[] {"CCC", "CCC", "CCC", 'C', ModItems.f, 'X', Items.iron_ingot});
	}
	private static void addSmelting()
	{
	GameRegistry.addSmelting(ModItems.BlockA, new ItemStack(ModItems.f, 1), 5.0F);
	}

	private static void registerArmor(Item item, String name)
	{
		String unlocalizedName = name.toLowerCase().replaceAll(" ", "_").replaceAll("'", "");
		item.setUnlocalizedName(unlocalizedName);
		item.setTextureName(StevenUniverseMod.MODID + ":" + unlocalizedName);
		item.setCreativeTab(StevenUniverseMod.tabSU);
		
		GameRegistry.registerItem(item, unlocalizedName);
	}
	
	private static void registerTheItem(Item item, String name)
	{
		String unlocalizedName = name.toLowerCase().replaceAll(" ", "_").replaceAll("'", "");
		item.setUnlocalizedName(unlocalizedName);
		item.setTextureName(StevenUniverseMod.MODID + ":" + unlocalizedName);
		item.setCreativeTab(StevenUniverseMod.tabSU);
		
		GameRegistry.registerItem(item, unlocalizedName);
	}
	private static void registerBlock(Block block, String name)
	{
		String unlocalizedName = name.toLowerCase().replaceAll(" ", "_").replaceAll("'", "");
		block.setBlockName(unlocalizedName);
		block.setBlockTextureName(StevenUniverseMod.MODID + ":" + unlocalizedName);
		block.setCreativeTab(StevenUniverseMod.tabSU);
		
		GameRegistry.registerBlock(block, unlocalizedName);
	}

}
