package com.blazingstreak.elemag.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.blazingstreak.elemag.lib.Strings;
import com.blazingstreak.elemag.lib.Textures;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemAirShard extends Item {
	
	public ItemAirShard(int id) {
		super(id);
		setCreativeTab(CreativeTabs.tabMaterials);
		setUnlocalizedName(Strings.AIR_SHARD_UNLOCALIZED_NAME);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister register) {
		itemIcon = register.registerIcon(Textures.TEXTURE_LOCATION + ":" + Strings.AIR_SHARD_UNLOCALIZED_NAME);
	}
}
