package net.su.common.items;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.su.common.blocks.GemOre;
import net.su.common.items.armor.itemAmethystGem;
import net.su.common.items.armor.itemGarnetGem;
import net.su.common.items.armor.itemPearlGem;
import net.su.common.items.armor.itemStevenGem;
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
	public static Item h;
	public static Item Food1;
	public static Block BlockA;
	public static Item ingot;
	public static Item bookA;
	public static Item Sword;
	
	/* Swords */
	  static ToolMaterial RosesSwordToolMaterial = EnumHelper.addToolMaterial("RosesSwordToolMaterial", 2, 750, 7, 76.0F, 20);
		
	
	/* Armor */
	
	public static Item Armor1A;
	public static Item Armor1B;
	public static Item Armor1C;
	public static Item Armor1D;
	
	public static Item Armor2A;
	public static Item Armor2B;
	public static Item Armor2C;
	public static Item Armor2D;
	
	
	public static Item Armor3A;
	public static Item Armor3B;
	public static Item Armor3C;
	public static Item Armor3D;
	
	public static Item Armor4A;
	public static Item Armor4B;
	public static Item Armor4C;
	public static Item Armor4D;
	
	
	public static void register()
	{
	
		
		a = new Amythist();
		
		b = new Steven();
		
		c = new Donut(20, false);
		
		Food1 = new Donut(50, false);
		
		d = new TheItem();
		
		e = new TheItem();
		
		f = new TheItem();
		
		g = new Pearl();
		
		bookA = new Book();
		
		h = new Garnet();
		
		ingot = new Ingot();
		
		/* Sword */
		
		Sword = new RoseSword(RosesSwordToolMaterial).setUnlocalizedName("roses_sword").setCreativeTab(StevenUniverseMod.tabSU).setTextureName(StevenUniverseMod.MODID + ":" + "roses_sword").setCreativeTab(StevenUniverseMod.tabSU);
		GameRegistry.registerItem(Sword, Sword.getUnlocalizedName().substring(5));
		
		/* Armor */
		
		Armor1A = new itemAmethystGem(0);
		Armor1B = new itemAmethystGem(1);
		Armor1C = new itemAmethystGem(2);
		Armor1D = new itemAmethystGem(3);
		
		Armor2A = new itemPearlGem(0);
		Armor2B = new itemPearlGem(1);
		Armor2C = new itemPearlGem(2);
		Armor2D = new itemPearlGem(3);
		
		Armor3A = new itemGarnetGem(0);
		Armor3B = new itemGarnetGem(1);
		Armor3C = new itemGarnetGem(2);
		Armor3D = new itemGarnetGem(3);
		
		Armor4A = new itemStevenGem(0);
		Armor4B = new itemStevenGem(1);
		Armor4C = new itemStevenGem(2);
		Armor4D = new itemStevenGem(3);
		
		registerArmor(Armor1A, "gem_helmet");
		registerArmor(Armor1B, "gem_jacket");
		registerArmor(Armor1C, "gem_pants");
		registerArmor(Armor1D, "gem_boots");
		
		registerArmor(Armor2A, "gem1_helmet");
		registerArmor(Armor2B, "gem1_jacket");
		registerArmor(Armor2C, "gem1_pants");
		registerArmor(Armor2D, "gem1_boots");
		
		registerArmor(Armor3A, "gem2_helmet");
		registerArmor(Armor3B, "gem2_jacket");
		registerArmor(Armor3C, "gem2_pants");
		registerArmor(Armor3D, "gem2_boots");
		
		registerArmor(Armor4A, "gem3_helmet");
		registerArmor(Armor4B, "gem3_jacket");
		registerArmor(Armor4C, "gem3_pants");
		registerArmor(Armor4D, "gem3_boots");
		
		registerTheItem(ingot, "ingots");
		registerTheItem(a, "gem1");
		registerTheItem(b, "gem2");
		registerTheItem(c, "donut");
		registerTheItem(Food1, "Cookie_Cat");
/*		registerTheItem(d, "gem3"); */
/*		registerTheItem(e, "gem4"); */
		registerTheItem(g, "gem5");
		registerTheItem(bookA, "How_to_Talk_to_People");
/*		registerTheItem(f, "lapis"); */
		registerTheItem(h, "gem6");
		
		BlockA = new GemOre();
		
		registerBlock(BlockA, "gem_ore");
		
	}
	
	
	
	
	public static void registerRecipes()
	{
		GameRegistry.addRecipe(new ItemStack(ModItems.a, 1), new Object[] {"CXC", "CXC", "CXC", 'X', ModItems.ingot});
		GameRegistry.addRecipe(new ItemStack(ModItems.b, 1), new Object[] {"XCC", "XCC", "XCC", 'X', ModItems.ingot});
		GameRegistry.addRecipe(new ItemStack(ModItems.g, 1), new Object[] {"XCX", "XCX", "XCX", 'X', ModItems.ingot});
		GameRegistry.addRecipe(new ItemStack(ModItems.h, 1), new Object[] {"CCX", "CXC", "XCC", 'X', ModItems.ingot});
		GameRegistry.addRecipe(new ItemStack(ModItems.BlockA, 1), new Object[] {"CCC", "CCC", "CCC", 'C', ModItems.ingot});
		
		
	}
	private static void addSmelting()
	{
	GameRegistry.addSmelting(ModItems.BlockA, new ItemStack(ModItems.ingot, 1), 5.0F);
	}

	private static void registerArmor(Item item, String name)
	{
		String unlocalizedName = name.toLowerCase().replaceAll(" ", "_").replaceAll("'", "");
		item.setUnlocalizedName(unlocalizedName);
		item.setTextureName(StevenUniverseMod.MODID + ":" + "textures/armor" + unlocalizedName);
		item.setCreativeTab(CreativeTabs.tabAllSearch);
		
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
