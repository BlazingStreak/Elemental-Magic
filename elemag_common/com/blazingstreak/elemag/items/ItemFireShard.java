package com.blazingstreak.elemag.items;

import com.blazingstreak.elemag.lib.Strings;
import com.blazingstreak.elemag.lib.Textures;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemFireShard extends Item {

	public ItemFireShard(int id) {
		super(id);
		setCreativeTab(CreativeTabs.tabMaterials);
		setUnlocalizedName(Strings.FIRE_SHARD_UNLOCALIZED_NAME);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister register) {
		itemIcon = register.registerIcon(Textures.TEXTURE_LOCATION + ":" + Strings.FIRE_SHARD_UNLOCALIZED_NAME);
	}

}