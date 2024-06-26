
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.grawmpy.reored.forge.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.grawmpy.reored.forge.item.SiverPickaxeItem;
import net.grawmpy.reored.forge.item.SilverSwordItem;
import net.grawmpy.reored.forge.item.SilverShovelItem;
import net.grawmpy.reored.forge.item.SilverNuggetItem;
import net.grawmpy.reored.forge.item.SilverIngotItem;
import net.grawmpy.reored.forge.item.SilverHoeItem;
import net.grawmpy.reored.forge.item.SilverAxeItem;
import net.grawmpy.reored.forge.item.SilverArmorItem;
import net.grawmpy.reored.forge.item.RawSilverItem;
import net.grawmpy.reored.forge.item.RawDeepIronItem;
import net.grawmpy.reored.forge.item.OakArmorItem;
import net.grawmpy.reored.forge.item.DeepIronSwordItem;
import net.grawmpy.reored.forge.item.DeepIronShovelItem;
import net.grawmpy.reored.forge.item.DeepIronPickaxeItem;
import net.grawmpy.reored.forge.item.DeepIronNuggetItem;
import net.grawmpy.reored.forge.item.DeepIronIngotItem;
import net.grawmpy.reored.forge.item.DeepIronHoeItem;
import net.grawmpy.reored.forge.item.DeepIronAxeItem;
import net.grawmpy.reored.forge.item.CopperSwordItem;
import net.grawmpy.reored.forge.item.CopperShovelItem;
import net.grawmpy.reored.forge.item.CopperPickaxeItem;
import net.grawmpy.reored.forge.item.CopperHoeItem;
import net.grawmpy.reored.forge.item.CopperAxeItem;
import net.grawmpy.reored.forge.item.CopperArmorItem;
import net.grawmpy.reored.forge.ReoredforgeMod;

public class ReoredforgeModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ReoredforgeMod.MODID);
	public static final RegistryObject<Item> OAK_ARMOR_HELMET = REGISTRY.register("oak_armor_helmet", () -> new OakArmorItem.Helmet());
	public static final RegistryObject<Item> OAK_ARMOR_CHESTPLATE = REGISTRY.register("oak_armor_chestplate", () -> new OakArmorItem.Chestplate());
	public static final RegistryObject<Item> OAK_ARMOR_LEGGINGS = REGISTRY.register("oak_armor_leggings", () -> new OakArmorItem.Leggings());
	public static final RegistryObject<Item> OAK_ARMOR_BOOTS = REGISTRY.register("oak_armor_boots", () -> new OakArmorItem.Boots());
	public static final RegistryObject<Item> COPPER_PICKAXE = REGISTRY.register("copper_pickaxe", () -> new CopperPickaxeItem());
	public static final RegistryObject<Item> COPPER_SWORD = REGISTRY.register("copper_sword", () -> new CopperSwordItem());
	public static final RegistryObject<Item> COPPER_AXE = REGISTRY.register("copper_axe", () -> new CopperAxeItem());
	public static final RegistryObject<Item> COPPER_SHOVEL = REGISTRY.register("copper_shovel", () -> new CopperShovelItem());
	public static final RegistryObject<Item> COPPER_HOE = REGISTRY.register("copper_hoe", () -> new CopperHoeItem());
	public static final RegistryObject<Item> COPPER_ARMOR_HELMET = REGISTRY.register("copper_armor_helmet", () -> new CopperArmorItem.Helmet());
	public static final RegistryObject<Item> COPPER_ARMOR_CHESTPLATE = REGISTRY.register("copper_armor_chestplate", () -> new CopperArmorItem.Chestplate());
	public static final RegistryObject<Item> COPPER_ARMOR_LEGGINGS = REGISTRY.register("copper_armor_leggings", () -> new CopperArmorItem.Leggings());
	public static final RegistryObject<Item> COPPER_ARMOR_BOOTS = REGISTRY.register("copper_armor_boots", () -> new CopperArmorItem.Boots());
	public static final RegistryObject<Item> SILVER_ORE = block(ReoredforgeModBlocks.SILVER_ORE);
	public static final RegistryObject<Item> DEEPSLATE_SILVER_ORE = block(ReoredforgeModBlocks.DEEPSLATE_SILVER_ORE);
	public static final RegistryObject<Item> SILVER_SWORD = REGISTRY.register("silver_sword", () -> new SilverSwordItem());
	public static final RegistryObject<Item> RAW_SILVER = REGISTRY.register("raw_silver", () -> new RawSilverItem());
	public static final RegistryObject<Item> SILVER_INGOT = REGISTRY.register("silver_ingot", () -> new SilverIngotItem());
	public static final RegistryObject<Item> SILVER_NUGGET = REGISTRY.register("silver_nugget", () -> new SilverNuggetItem());
	public static final RegistryObject<Item> SILVER_PICKAXE = REGISTRY.register("silver_pickaxe", () -> new SiverPickaxeItem());
	public static final RegistryObject<Item> SILVER_AXE = REGISTRY.register("silver_axe", () -> new SilverAxeItem());
	public static final RegistryObject<Item> SILVER_SHOVEL = REGISTRY.register("silver_shovel", () -> new SilverShovelItem());
	public static final RegistryObject<Item> SILVER_HOE = REGISTRY.register("silver_hoe", () -> new SilverHoeItem());
	public static final RegistryObject<Item> SILVER_ARMOR_HELMET = REGISTRY.register("silver_armor_helmet", () -> new SilverArmorItem.Helmet());
	public static final RegistryObject<Item> SILVER_ARMOR_CHESTPLATE = REGISTRY.register("silver_armor_chestplate", () -> new SilverArmorItem.Chestplate());
	public static final RegistryObject<Item> SILVER_ARMOR_LEGGINGS = REGISTRY.register("silver_armor_leggings", () -> new SilverArmorItem.Leggings());
	public static final RegistryObject<Item> SILVER_ARMOR_BOOTS = REGISTRY.register("silver_armor_boots", () -> new SilverArmorItem.Boots());
	public static final RegistryObject<Item> DEEP_IRON_ORE = block(ReoredforgeModBlocks.DEEP_IRON_ORE);
	public static final RegistryObject<Item> DEEPSLATE_DEEP_IRON_ORE = block(ReoredforgeModBlocks.DEEPSLATE_DEEP_IRON_ORE);
	public static final RegistryObject<Item> RAW_DEEP_IRON = REGISTRY.register("raw_deep_iron", () -> new RawDeepIronItem());
	public static final RegistryObject<Item> DEEP_IRON_INGOT = REGISTRY.register("deep_iron_ingot", () -> new DeepIronIngotItem());
	public static final RegistryObject<Item> DEEP_IRON_NUGGET = REGISTRY.register("deep_iron_nugget", () -> new DeepIronNuggetItem());
	public static final RegistryObject<Item> DEEP_IRON_BLOCK = block(ReoredforgeModBlocks.DEEP_IRON_BLOCK);
	public static final RegistryObject<Item> DEEP_IRON_SWORD = REGISTRY.register("deep_iron_sword", () -> new DeepIronSwordItem());
	public static final RegistryObject<Item> DEEP_IRON_PICKAXE = REGISTRY.register("deep_iron_pickaxe", () -> new DeepIronPickaxeItem());
	public static final RegistryObject<Item> DEEP_IRON_AXE = REGISTRY.register("deep_iron_axe", () -> new DeepIronAxeItem());
	public static final RegistryObject<Item> DEEP_IRON_SHOVEL = REGISTRY.register("deep_iron_shovel", () -> new DeepIronShovelItem());
	public static final RegistryObject<Item> DEEP_IRON_HOE = REGISTRY.register("deep_iron_hoe", () -> new DeepIronHoeItem());

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
