package com.blazingstreak.elemag.generation;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

import com.blazingstreak.elemag.blocks.Blocks;

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
		for(int k = 0; k < 3; k++) {
			(new WorldGenMinable(Blocks.bWaterShard.blockID, 6)).generate(world, random, i + random.nextInt(16), random.nextInt(32), j + random.nextInt(16));
			(new WorldGenMinable(Blocks.bFireShard.blockID, 6)).generate(world, random, i + random.nextInt(16), random.nextInt(32), j + random.nextInt(16));
			(new WorldGenMinable(Blocks.bEarthShard.blockID, 6)).generate(world, random, i + random.nextInt(16), random.nextInt(32), j + random.nextInt(16));
			(new WorldGenMinable(Blocks.bAirShard.blockID, 6)).generate(world, random, i + random.nextInt(16), random.nextInt(32), j + random.nextInt(16));
		}
	}

	private void generateNether(World world, Random random, int i, int j) {
		
	}

	private void generateEnd(World world, Random random, int i, int j) {
		
	}
}