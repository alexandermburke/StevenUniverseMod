package net.su.common.world.gen;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.su.common.items.ModItems;
import cpw.mods.fml.common.IWorldGenerator;

public class WorldGenSU implements IWorldGenerator 
{
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) 
	{
		switch (world.provider.dimensionId)
		{
		case 0:
			generateOverworld(world, random, chunkX * 16, chunkZ * 16);
			break;
		case -1:
			generateNether(world, random, chunkX * 16, chunkZ * 16);
			break;
		}
	}
	
	/**
	 * This area still needs to be edited Chow.
	 * @param world
	 * @param random
	 * @param chunkX
	 * @param chunkZ
	 */
	public void generateOverworld(World world, Random random, int chunkX, int chunkZ)
	{
		generateOre(3, ModItems.BlockA, 5, 8, world, random, chunkX, chunkZ);
		
	}
	
	public void generateNether(World world, Random random, int chunkX, int chunkZ)
	{
	}
	
	public void generateOre(int veinsPerChunk, Block block, int veinSize, int minY, World world, Random random, int chunkX, int chunkZ)
	{
		Random randomGenerator = random;
		
		for (int i = 0; i < veinsPerChunk; i++)
		{
			int randPosX = chunkX + randomGenerator.nextInt(16);
			int randPosY = random.nextInt(minY);
			int randPosZ = chunkZ + randomGenerator.nextInt(16);
			new WorldGenMinable(block, veinSize).generate(world, random, randPosX, randPosY, randPosZ);
		}
	}
}