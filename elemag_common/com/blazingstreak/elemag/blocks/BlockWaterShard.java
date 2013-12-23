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

public class BlockWaterShard extends Block {
	
	public BlockWaterShard(int id) {
		super(id, Material.iron);
		setCreativeTab(CreativeTabs.tabBlock);
		setHardness(2F);
		setStepSound(Block.soundStoneFootstep);
		setUnlocalizedName(Strings.B_WATER_SHARD_UNLOCALIZED_NAME);
	}
	
	@Override
	public int idDropped(int par1, Random random, int zero) {
		return Items.waterShard.itemID;
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister register) {
		blockIcon = register.registerIcon(Textures.TEXTURE_LOCATION + ":" + Strings.B_WATER_SHARD_UNLOCALIZED_NAME);
	}
}
