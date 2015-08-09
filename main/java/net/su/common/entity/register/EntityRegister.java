package net.su.common.entity.register;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import net.su.common.entity.amythist.EntityAmythistMob;
import net.su.common.entity.garnet.EntityGarnetMob;
import net.su.common.entity.pearl.EntityPearlMob;
import net.su.common.entity.steven.EntityStevenMob;
import net.su.common.main.StevenUniverseMod;
import cpw.mods.fml.common.registry.EntityRegistry;


public class EntityRegister {
	
	
	public static void register()
	{
		
		

		registerEntity(EntityAmythistMob.class, "Amythist", 40, 1, true);

		registerEntity(EntityStevenMob.class, "Steven", 40, 1, true);
		
		registerEntity(EntityPearlMob.class, "Pearl", 40, 1, true);
		
		registerEntity(EntityGarnetMob.class, "Garnet", 40, 1, true);
		
	}
	
	private static void registerEntity(Class<? extends Entity> entityClass, String name, int trackingRange, int updateFrequency, boolean sendVelocityUpdates)
	{
		int id = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerGlobalEntityID(entityClass, name, id, 0, 0);
		EntityRegistry.registerModEntity(entityClass, name, id, StevenUniverseMod.instance, trackingRange, updateFrequency, sendVelocityUpdates);
	}
}
