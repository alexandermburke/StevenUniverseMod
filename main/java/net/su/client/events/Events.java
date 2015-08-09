package net.su.client.events;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.su.client.model.render.AmythistCustomPlayerRenderer;
import net.su.common.achievement.SUAchievements;
import net.su.common.entity.amythist.EntityAmythistMob;
import net.su.common.items.ModItems;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;

public class Events {


	 Minecraft mc = Minecraft.getMinecraft();
	    EntityPlayer player = mc.thePlayer;
	    AmythistCustomPlayerRenderer renderCustomPlayer = new AmythistCustomPlayerRenderer();
	    
	        


	@SuppressWarnings("unchecked")
	@SubscribeEvent
	public void clientLoggedIn(EntityJoinWorldEvent event)
	{			
	
	
	
		
		if (event.entity instanceof EntityPlayer) 
		{
			
			
			EntityPlayer p = (EntityPlayer) event.entity;
			 p.addStat(SUAchievements.LoadMod, 1);
			 p.inventory.addItemStackToInventory(new ItemStack(ModItems.bookA));
			p.addChatMessage(new ChatComponentText("Thanks for downloading the Steven Universe Mod 0.6.3"));
		
		}
			
		}
	
	 @SubscribeEvent
	  public void onPlayerLogin(PlayerEvent.PlayerLoggedInEvent event)
	  {
			if (event.player instanceof EntityPlayer) 
			{
			
			}
	  }
	  
	 @SubscribeEvent
	  public void onPlayerKilledBySU(LivingDeathEvent event)
	  {
		 
		 if ((event.entity instanceof EntityPlayer))
		    {
		 

	        if ((event.source.getEntity() instanceof EntityAmythistMob))
	        {
	        	player.addChatMessage(new ChatComponentText("§6 You just got rekt by Amythist..."));
	       	 	player.addStat(SUAchievements.KilledByAmythest, 1);
	        	
	        }
	        
		    }
		 
	  }
}
