package net.su.client.utils;

import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;

import com.google.common.eventbus.Subscribe;

public class SpawnEvent {
	@Subscribe
	public void onEntitySpawn(EntityJoinWorldEvent event)
	{
		if(event.entity instanceof EntitySlime || event.entity instanceof EntityZombie || event.entity instanceof EntitySpider) {
	    	event.setCanceled(true);
	    	
	    }
	}
	
}
	
