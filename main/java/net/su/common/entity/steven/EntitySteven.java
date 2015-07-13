package net.su.common.entity.steven;

import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import net.su.common.main.StevenUniverseMod;
import cpw.mods.fml.common.registry.EntityRegistry;


public class EntitySteven {
	public static void mainRegistry(){
	registerEntity();
}

public static void registerEntity(){
	
	createEntity(EntityStevenMob.class, "Pearl", 0xF20521, 0x2011CF);
	
}
//Sounds



protected String getLivingSound()
{
    return "scare";
}
protected String getHurtSound()
{
    return "";
}
protected String getDeathSound()
{
    return "CROWD_SMALL_CHIL_EC049202";
}

@SuppressWarnings("unchecked")
public static void createEntity(@SuppressWarnings("rawtypes") Class entityClass, String entityName, int solidColor, int spotColor){
	int randomId = EntityRegistry.findGlobalUniqueEntityId();
	EntityRegistry.registerGlobalEntityID(entityClass, entityName, randomId);
	EntityRegistry.registerModEntity(entityClass, entityName, randomId, StevenUniverseMod.instance, 64, 1, true);
	EntityRegistry.addSpawn(entityClass, 2, 0, 1, EnumCreatureType.creature, BiomeGenBase.forest);
	
	createEgg(randomId, solidColor, spotColor);
	
}

@SuppressWarnings("unchecked")
private static void createEgg(int randomId, int solidColor, int spotColor){
	EntityList.entityEggs.put(Integer.valueOf(randomId), new EntityList.EntityEggInfo(randomId, solidColor, spotColor));
	
}

}