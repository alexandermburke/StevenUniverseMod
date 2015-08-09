package net.su.common.main;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.su.client.events.Events;
import net.su.client.gui.GUIOverlayDev;
import net.su.client.gui.GuiRun;
import net.su.client.rank.Rank;
import net.su.client.utils.SpawnEvent;
import net.su.common.entity.amythist.EntityAmythistMob;
import net.su.common.entity.register.EntityRegister;
import net.su.common.entity.steven.EntityStevenMob;
import net.su.common.items.ModItems;
import net.su.common.proxy.CommonProxy;
import net.su.common.tabs.StevenUniverseTab;
import net.su.common.world.gen.WorldGenSU;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MODID, version = Reference.VERSION, name = Reference.NAME)
public class StevenUniverseMod
{
  public static CreativeTabs tabSU = new StevenUniverseTab ("standard");

  	@Instance(Reference.MODID) 
	public static StevenUniverseMod instance;
	public Rank force = new Rank();
  	
    public static Configuration Config;
	
    public static final String MODID = "su";
    public static final String VERSION = "1.0";
    public static final String NAME = "Steven Universe Mod";
    
    public static int NewId;
    
    
    @SidedProxy(clientSide = "net.su.common.proxy.CommonProxy", serverSide = "net.su.common.proxy.ClientProxy")
	public static CommonProxy proxy;
    

    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {


    	
    	
    }
    
    public void PreLoad(FMLPostInitializationEvent event)
    {
    
    	FMLCommonHandler.instance().bus().register(StevenUniverseMod.instance);
    	 
    	MinecraftForge.EVENT_BUS.register(new GuiRun());
      	FMLCommonHandler.instance().bus().register(new GuiRun());
      	
    
    }
    
    int randomId = EntityRegistry.findGlobalUniqueEntityId();
    
   Boolean StevenUniverseOn;
   Boolean AIOn;
   Boolean AnimationOn;
   
    @EventHandler
    public void PreInit(FMLPreInitializationEvent event){

    	EntityRegister.register();
    	
    	Configuration config = new Configuration(event.getSuggestedConfigurationFile());

    	config.load();

    	StevenUniverseOn = config.getBoolean("StevenUniverse Mod On?", "Boolean", false, "Turn off the steven Universe Mod.");
    	StevenUniverseOn = config.get(config.CATEGORY_GENERAL, "TurnOffTheStevenUniverseMod?", false).getBoolean(false);
    	
    	AIOn = config.getBoolean("AI On?", "Boolean", true, "Enable or disable AI.");
    	AIOn = config.get(config.CATEGORY_GENERAL, "Disable AI", true).getBoolean(true);
    
    	AnimationOn = config.getBoolean("Animation On?", "Boolean", true, "Enable or disable Animation 9Reccomemnded for slow computers).");
    	AnimationOn = config.get(config.CATEGORY_GENERAL, "Disable Animation", true).getBoolean(true);
    	
    		
    	config.save();
    	
    	TickHandler.mainregistry();
    	
    	proxy.registerRenderThings();
    	
    	ModItems.init();
    	
    	
        MinecraftForge.EVENT_BUS.register(new Events());

        MinecraftForge.EVENT_BUS.register(new SpawnEvent());
    
        GUIOverlayDev.load();
        
		GameRegistry.registerWorldGenerator(new WorldGenSU(), 0);
        
        
    }

    
    
    
    @EventHandler
  	public void onServerStarting(FMLServerStartingEvent event)
  	{
     // Example 	Commands.register(event);
      	
  	}



}
