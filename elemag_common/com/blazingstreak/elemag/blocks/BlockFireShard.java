package com.blazingstreak.elemag.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

import com.blazingstreak.elemag.items.Items;
import com.blazingstreak.elemag.lib.Strings;
import com.blazingstreak.elemag.lib.Textures;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockFireShard extends Block {

	public BlockFireShard(int id) {
		super(id, Material.iron);
		setCreativeTab(CreativeTabs.tabBlock);
		setHardness(2F);
		setStepSound(Block.soundStoneFootstep);
		setUnlocalizedName(Strings.B_FIRE_SHARD_UNLOCALIZED_NAME);
	}
	
	@Override
	public int idDropped(int par1, Random random, int zero) {
		return Items.fireShard.itemID;
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister register) {
		blockIcon = register.registerIcon(Textures.TEXTURE_LOCATION + ":" + Strings.B_FIRE_SHARD_UNLOCALIZED_NAME);
	}
}
