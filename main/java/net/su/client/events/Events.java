package net.su.client.events;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.su.common.entity.amythist.EntityAmythistMob;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;

public class Events {

	
EntityPlayer player;
	
	@SubscribeEvent
	public void clientLoggedIn(EntityJoinWorldEvent event)
	{			
	
	
	
		
		if (event.entity instanceof EntityPlayer) 
		{
			
			EntityPlayer p = (EntityPlayer) event.entity;
			p.addChatMessage(new ChatComponentText("§5Thanks for downloading the Steven Universe Mod ~ Beta 1.0.0"));
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
	        	
	        	
	        }
	        
		    }
		 
	  }
}
