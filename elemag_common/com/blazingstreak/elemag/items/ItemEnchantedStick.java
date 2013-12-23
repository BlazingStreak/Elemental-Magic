package com.blazingstreak.elemag.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.blazingstreak.elemag.lib.Strings;
import com.blazingstreak.elemag.lib.Textures;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemEnchantedStick extends Item {
	
	public ItemEnchantedStick(int id) {
		super(id);
		setCreativeTab(CreativeTabs.tabMaterials);
		setUnlocalizedName(Strings.ENCHANTED_STICK_UNLOCALIZED_NAME);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister register) {
		itemIcon = register.registerIcon(Textures.TEXTURE_LOCATION + ":" + Strings.ENCHANTED_STICK_UNLOCALIZED_NAME);
	}

}
