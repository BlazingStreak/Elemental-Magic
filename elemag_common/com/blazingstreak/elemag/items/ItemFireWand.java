package com.blazingstreak.elemag.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.blazingstreak.elemag.lib.Strings;
import com.blazingstreak.elemag.lib.Textures;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemFireWand extends Item {

	public ItemFireWand(int id) {
		super(id);
		setCreativeTab(CreativeTabs.tabCombat);
		setMaxStackSize(1);
		setUnlocalizedName(Strings.FIRE_WAND_UNLOCALIZED_NAME);
		setMaxDamage(127);
	}
	
	@Override
	public boolean itemInteractionForEntity(ItemStack itemStack, EntityPlayer player, EntityLivingBase target) {
		if(!target.worldObj.isRemote) {
			target.setFire(5);
			itemStack.damageItem(1, player);
		}	
		return false;
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister register) {
		itemIcon = register.registerIcon(Textures.TEXTURE_LOCATION + ":" + Strings.FIRE_WAND_UNLOCALIZED_NAME);
	}
}
