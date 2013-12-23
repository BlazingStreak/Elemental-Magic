package com.blazingstreak.elemag;

import com.blazingstreak.elemag.blocks.Blocks;
import com.blazingstreak.elemag.core.proxy.CommonProxy;
import com.blazingstreak.elemag.generation.Generation;
import com.blazingstreak.elemag.items.Items;
import com.blazingstreak.elemag.lib.Reference;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(
	modid = Reference.MOD_ID,
	name = Reference.MOD_NAME,
	version = Reference.MOD_VERSION
)
public class ElementalMagic {

	@Instance(Reference.MOD_ID)
	public static ElementalMagic instance;
	
	@SidedProxy(
		clientSide = Reference.CLIENT_PROXY,
		serverSide = Reference.COMMON_PROXY
	)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		Items.init();
		Blocks.init();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		Items.addNames();
		Blocks.addNames();
		Generation.init();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}
}
