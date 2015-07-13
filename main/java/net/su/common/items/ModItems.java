package net.su.common.items;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
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
	
	
	
	public static void register()
	{
	
		
		a = new Amythist();
		
		b = new Steven();
		
		c = new Donut();
		
		d = new TheItem();
		
		e = new TheItem();
		
		f = new TheItem();
		
		registerTheItem(a, "Amethyst_Gem");
		registerTheItem(b, "Rose_Quartz_Gem");
		registerTheItem(c, "Donut_1");
		registerTheItem(d, "Alexandrite_Gem_1");
		registerTheItem(e, "Garnet_Gem_1");
		registerTheItem(f, "Lapis_Lazuli_Gem");
		
	}
	
	
	
	
	public static void registerRecipes()
	{
	// Example	GameRegistry.addRecipe(new ItemStack(FNAFItems.FreddysMic, 1), new Object[] {"CXX", "XCX", "XXC", 'C', FNAFItems.PlasticIngot, '0', Material.wood});
	}
	private static void addSmelting()
	{
	//Example	GameRegistry.addSmelting(FNAFItems.plasticOres, new ItemStack(FNAFItems.PlasticIngot, 1), 5.0F);
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
