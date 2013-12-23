package com.blazingstreak.elemag.blocks;

import com.blazingstreak.elemag.lib.ItemIds;
import com.blazingstreak.elemag.lib.Strings;

import net.minecraft.block.Block;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class Blocks {
	
	public static Block bWaterShard;
	public static Block bFireShard;
	public static Block bEarthShard;
	public static Block bAirShard;
	
	public static void init() {
		
		//Initialize Blocks
		bWaterShard = new BlockWaterShard(ItemIds.B_WATER_SHARD_DEFAULT);
		bFireShard = new BlockFireShard(ItemIds.B_FIRE_SHARD_DEFAULT);
		bEarthShard = new BlockEarthShard(ItemIds.B_EARTH_SHARD_DEFAULT);
		bAirShard = new BlockAirShard(ItemIds.B_AIR_SHARD_DEFAULT);
		
		//Register Blocks
		GameRegistry.registerBlock(bWaterShard, Strings.B_WATER_SHARD_UNLOCALIZED_NAME);
		GameRegistry.registerBlock(bFireShard, Strings.B_FIRE_SHARD_UNLOCALIZED_NAME);
		GameRegistry.registerBlock(bEarthShard, Strings.B_EARTH_SHARD_UNLOCALIZED_NAME);
		GameRegistry.registerBlock(bAirShard, Strings.B_AIR_SHARD_UNLOCALIZED_NAME);
		
		MinecraftForge.setBlockHarvestLevel(bWaterShard, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(bFireShard, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(bEarthShard, "pickaxe", 2);
		MinecraftForge.setBlockHarvestLevel(bAirShard, "pickaxe", 2);
	}
	
	public static void addNames() {
		LanguageRegistry.addName(bWaterShard, Strings.B_WATER_SHARD_NAME);
		LanguageRegistry.addName(bFireShard, Strings.B_FIRE_SHARD_NAME);
		LanguageRegistry.addName(bEarthShard, Strings.B_EARTH_SHARD_NAME);
		LanguageRegistry.addName(bAirShard, Strings.B_AIR_SHARD_NAME);
	}
}