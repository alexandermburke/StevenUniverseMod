package net.su.common.entity.register;

import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import net.su.common.entity.amythist.EntityAmythistMob;
import net.su.common.entity.steven.EntityStevenMob;
import net.su.common.main.StevenUniverseMod;
import cpw.mods.fml.common.registry.EntityRegistry;


public class EntityRegister {
	
	public static void load() {
		registerEntity();
	}
	

	
	public static void registerEntity(){
		

			createEntity(EntityAmythistMob.class, "Amethyst", 0x000000, 0x000000);
			createEntity(EntityStevenMob.class, "Steven", 0x000000, 0x000000);
		 	
	 	
	 	
	 	
	 	
	 	
	}
	
	
	
	public static void createEntity(Class entityClass, String entityName, int solidColor, int spotColor){
		int randomId = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerGlobalEntityID(entityClass, entityName, randomId);
		EntityRegistry.registerModEntity(entityClass, entityName, randomId, StevenUniverseMod.instance, 64, 1, true);
		EntityRegistry.addSpawn(entityClass, 2, 0, 1, EnumCreatureType.creature, BiomeGenBase.forest);
		
		createEgg(randomId, solidColor, spotColor);
		
	}
	
	private static void createEgg(int randomId, int solidColor, int spotColor){
		EntityList.entityEggs.put(Integer.valueOf(randomId), new EntityList.EntityEggInfo(randomId, solidColor, spotColor));
		
	}

}
