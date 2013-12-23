package com.blazingstreak.elemag.generation;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import cpw.mods.fml.common.IWorldGenerator;

public class WorldGenerator implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch(world.provider.dimensionId) {
			case -1:
				generateNether(world, random, chunkX * 16, chunkZ * 16);
				break;
			case 0:
				generateSurface(world, random, chunkX * 16, chunkZ * 16);
				break;
			case 1:
				generateEnd(world, random, chunkX * 16, chunkZ * 16);
				break;
			default:
				break;
		}
	}

	private void generateSurface(World world, Random random, int i, int j) {
		for(int k = 0; k < 10; k++) {
			//(new WorldGenMineable(TutorialMain.myFirstBlock.blockID, 13))
		}
	}

	private void generateNether(World world, Random random, int i, int j) {
		
	}

	private void generateEnd(World world, Random random, int i, int j) {
		
	}
}