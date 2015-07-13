package net.su.common.main;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.su.client.events.Events;
import net.su.client.gui.GUIOverlayDev;
import net.su.client.utils.SpawnEvent;
import net.su.common.entity.amythist.EntityAmythist;
import net.su.common.entity.amythist.EntityAmythistMob;
import net.su.common.entity.register.EntityRegister;
import net.su.common.entity.steven.EntityStevenMob;
import net.su.common.items.ModItems;
import net.su.common.proxy.CommonProxy;
import net.su.common.tabs.StevenUniverseTab;
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

@Mod(modid = Reference.MODID, version = Reference.VERSION, name = Reference.NAME)
public class StevenUniverseMod
{
  public static CreativeTabs tabSU = new StevenUniverseTab ("standard");

	public static StevenUniverseMod instance;
    
    public static Configuration Config;
	
    public static final String MODID = "su";
    public static final String VERSION = "1.0";
    public static final String NAME = "Steven Universe Mod";
    
    
    @SidedProxy(clientSide = "net.su.common.proxy.CommonProxy", serverSide = "net.su.common.proxy.ClientProxy")
	public static CommonProxy proxy;
    

    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {


    	
    	
    }
    
    public void PreLoad(FMLPostInitializationEvent event)
    {
    
    	FMLCommonHandler.instance().bus().register(StevenUniverseMod.instance);
        
    	
    
    }
    
    int randomId = EntityRegistry.findGlobalUniqueEntityId();
    int newId = 201;
	
    @EventHandler
    public void PreInit(FMLPreInitializationEvent event){

    	TickHandler.mainregistry();
    	
    	proxy.registerRenderThings();
    	
    	ModItems.init();
    	
   // 	FMLCommonHandler.instance().bus().register(StevenUniverseMod.instance);
       
    	EntityRegister.load();
    	
        MinecraftForge.EVENT_BUS.register(new Events());

        MinecraftForge.EVENT_BUS.register(new SpawnEvent());
    
        GUIOverlayDev.load();
        
    	
        
        
    }

    
    
    
    @EventHandler
  	public void onServerStarting(FMLServerStartingEvent event)
  	{
     // Example 	Commands.register(event);
      	
  	}



}
