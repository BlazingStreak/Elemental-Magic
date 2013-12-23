package com.blazingstreak.elemag.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.blazingstreak.elemag.lib.ItemIds;
import com.blazingstreak.elemag.lib.Strings;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class Items {
	
	//Declare Items
	public static Item waterShard;
	public static Item fireShard;
	public static Item earthShard;
	public static Item airShard;
	public static Item waterCrystal;
	public static Item fireCrystal;
	public static Item earthCrystal;
	public static Item airCrystal;
	public static Item enchantedStick;
	public static Item waterWand;
	public static Item fireWand;
	public static Item earthWand;
	public static Item airWand;
	
	public static void init() {
		
		//Initialize Items
		waterShard = new ItemWaterShard(ItemIds.WATER_SHARD_DEFAULT - 256);
		fireShard = new ItemFireShard(ItemIds.FIRE_SHARD_DEFAULT - 256);
		earthShard = new ItemEarthShard(ItemIds.EARTH_SHARD_DEFAULT - 256);
		airShard = new ItemAirShard(ItemIds.AIR_SHARD_DEFAULT - 256);
		waterCrystal = new ItemWaterCrystal(ItemIds.WATER_CRYSTAL_DEFAULT - 256);
		fireCrystal = new ItemFireCrystal(ItemIds.FIRE_CRYSTAL_DEFAULT - 256);
		earthCrystal = new ItemEarthCrystal(ItemIds.EARTH_CRYSTAL_DEFAULT - 256);
		airCrystal = new ItemAirCrystal(ItemIds.AIR_CRYSTAL_DEFAULT - 256);
		enchantedStick = new ItemEnchantedStick(ItemIds.ENCHANTED_STICK_DEFAULT - 256);
		waterWand = new ItemWaterWand(ItemIds.WATER_WAND_DEFAULT - 256);
		fireWand = new ItemFireWand(ItemIds.FIRE_WAND_DEFAULT - 256);
		earthWand = new ItemEarthWand(ItemIds.EARTH_WAND_DEFAULT - 256);
		airWand = new ItemAirWand(ItemIds.AIR_WAND_DEFAULT - 256);
		
		//Add Items to GameRegistry
		GameRegistry.registerItem(waterShard, Strings.WATER_SHARD_NAME);
		GameRegistry.registerItem(fireShard, Strings.FIRE_SHARD_NAME);
		GameRegistry.registerItem(earthShard, Strings.EARTH_SHARD_NAME);
		GameRegistry.registerItem(airShard, Strings.AIR_SHARD_NAME);
		GameRegistry.registerItem(waterCrystal, Strings.WATER_CRYSTAL_NAME);
		GameRegistry.registerItem(fireCrystal, Strings.FIRE_CRYSTAL_NAME);
		GameRegistry.registerItem(earthCrystal, Strings.EARTH_CRYSTAL_NAME);
		GameRegistry.registerItem(airCrystal, Strings.AIR_CRYSTAL_NAME);
		GameRegistry.registerItem(enchantedStick, Strings.ENCHANTED_STICK_NAME);
		GameRegistry.registerItem(waterWand, Strings.WATER_WAND_NAME);
		GameRegistry.registerItem(fireWand, Strings.FIRE_WAND_NAME);
		GameRegistry.registerItem(earthWand, Strings.EARTH_WAND_NAME);
		GameRegistry.registerItem(airWand, Strings.AIR_WAND_NAME);
		
		//Add Recipes
		GameRegistry.addRecipe(new ItemStack(waterCrystal), new Object[]{"www", "www", "www", 'w', waterShard});
		GameRegistry.addRecipe(new ItemStack(fireCrystal), new Object[]{"fff", "fff", "fff", 'f', fireShard});
		GameRegistry.addRecipe(new ItemStack(earthCrystal), new Object[]{"eee", "eee", "eee", 'e', earthShard});
		GameRegistry.addRecipe(new ItemStack(airCrystal), new Object[]{"aaa", "aaa", "aaa", 'a', airShard});
		GameRegistry.addShapelessRecipe(new ItemStack(enchantedStick), new ItemStack(Item.stick), new ItemStack(waterShard));
		GameRegistry.addShapelessRecipe(new ItemStack(enchantedStick), new ItemStack(Item.stick), new ItemStack(fireShard));
		GameRegistry.addShapelessRecipe(new ItemStack(enchantedStick), new ItemStack(Item.stick), new ItemStack(earthShard));
		GameRegistry.addShapelessRecipe(new ItemStack(enchantedStick), new ItemStack(Item.stick), new ItemStack(airShard));
		GameRegistry.addRecipe(new ItemStack(waterWand), new Object[]{"w  ", "/  ", "/  ", 'w', waterCrystal, '/', enchantedStick});
		GameRegistry.addRecipe(new ItemStack(waterWand), new Object[]{" w ", " / ", " / ", 'w', waterCrystal, '/', enchantedStick});
		GameRegistry.addRecipe(new ItemStack(waterWand), new Object[]{"  w", "  /", "  /", 'w', waterCrystal, '/', enchantedStick});
		GameRegistry.addRecipe(new ItemStack(fireWand), new Object[]{"f  ", "/  ", "/  ", 'f', fireCrystal, '/', enchantedStick});
		GameRegistry.addRecipe(new ItemStack(fireWand), new Object[]{" f ", " / ", " / ", 'f', fireCrystal, '/', enchantedStick});
		GameRegistry.addRecipe(new ItemStack(fireWand), new Object[]{"  f", "  /", "  /", 'f', fireCrystal, '/', enchantedStick});
		GameRegistry.addRecipe(new ItemStack(earthWand), new Object[]{"e  ", "/  ", "/  ", 'e', earthCrystal, '/', enchantedStick});
		GameRegistry.addRecipe(new ItemStack(earthWand), new Object[]{" e ", " / ", " / ", 'e', earthCrystal, '/', enchantedStick});
		GameRegistry.addRecipe(new ItemStack(earthWand), new Object[]{"  e", "  /", "  /", 'e', earthCrystal, '/', enchantedStick});
		GameRegistry.addRecipe(new ItemStack(airWand), new Object[]{"a  ", "/  ", "/  ", 'a', airCrystal, '/', enchantedStick});
		GameRegistry.addRecipe(new ItemStack(airWand), new Object[]{" a ", " / ", " / ", 'a', airCrystal, '/', enchantedStick});
		GameRegistry.addRecipe(new ItemStack(airWand), new Object[]{"  a", "  /", "  /", 'a', airCrystal, '/', enchantedStick});
	}
	
	public static void addNames() {
		LanguageRegistry.addName(waterShard, Strings.WATER_SHARD_NAME);
		LanguageRegistry.addName(fireShard, Strings.FIRE_SHARD_NAME);
		LanguageRegistry.addName(earthShard, Strings.EARTH_SHARD_NAME);
		LanguageRegistry.addName(airShard, Strings.AIR_SHARD_NAME);
		LanguageRegistry.addName(waterCrystal, Strings.WATER_CRYSTAL_NAME);
		LanguageRegistry.addName(fireCrystal, Strings.FIRE_CRYSTAL_NAME);
		LanguageRegistry.addName(earthCrystal, Strings.EARTH_CRYSTAL_NAME);
		LanguageRegistry.addName(airCrystal, Strings.AIR_CRYSTAL_NAME);
		LanguageRegistry.addName(enchantedStick, Strings.ENCHANTED_STICK_NAME);
		LanguageRegistry.addName(waterWand, Strings.WATER_WAND_NAME);
		LanguageRegistry.addName(fireWand, Strings.FIRE_WAND_NAME);
		LanguageRegistry.addName(earthWand, Strings.EARTH_WAND_NAME);
		LanguageRegistry.addName(airWand, Strings.AIR_WAND_NAME);
	}
}
