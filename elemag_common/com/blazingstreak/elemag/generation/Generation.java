package com.blazingstreak.elemag.generation;

import cpw.mods.fml.common.registry.GameRegistry;

public class Generation {

	public static void init() {
		WorldGenerator worldGen = new WorldGenerator();
		GameRegistry.registerWorldGenerator(worldGen);
	}
}
