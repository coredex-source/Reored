
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.grawmpy.reored.forge.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.grawmpy.reored.forge.ReoredforgeMod;

public class ReoredforgeModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ReoredforgeMod.MODID);
	public static final RegistryObject<CreativeModeTab> REORED_BLOCKS = REGISTRY.register("reored_blocks",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.reoredforge.reored_blocks")).icon(() -> new ItemStack(ReoredforgeModBlocks.DEEP_IRON_BLOCK.get())).displayItems((parameters, tabData) -> {
				tabData.accept(ReoredforgeModBlocks.SILVER_ORE.get().asItem());
				tabData.accept(ReoredforgeModBlocks.DEEPSLATE_SILVER_ORE.get().asItem());
				tabData.accept(ReoredforgeModItems.RAW_SILVER.get());
				tabData.accept(ReoredforgeModItems.SILVER_INGOT.get());
				tabData.accept(ReoredforgeModItems.SILVER_NUGGET.get());
				tabData.accept(ReoredforgeModBlocks.DEEP_IRON_ORE.get().asItem());
				tabData.accept(ReoredforgeModBlocks.DEEPSLATE_DEEP_IRON_ORE.get().asItem());
				tabData.accept(ReoredforgeModItems.RAW_DEEP_IRON.get());
				tabData.accept(ReoredforgeModItems.DEEP_IRON_INGOT.get());
				tabData.accept(ReoredforgeModItems.DEEP_IRON_NUGGET.get());
				tabData.accept(ReoredforgeModBlocks.DEEP_IRON_BLOCK.get().asItem());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> REORED_ARMORY = REGISTRY.register("reored_armory",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.reoredforge.reored_armory")).icon(() -> new ItemStack(ReoredforgeModItems.DEEP_IRON_SWORD.get())).displayItems((parameters, tabData) -> {
				tabData.accept(ReoredforgeModItems.OAK_ARMOR_HELMET.get());
				tabData.accept(ReoredforgeModItems.OAK_ARMOR_CHESTPLATE.get());
				tabData.accept(ReoredforgeModItems.OAK_ARMOR_LEGGINGS.get());
				tabData.accept(ReoredforgeModItems.OAK_ARMOR_BOOTS.get());
				tabData.accept(ReoredforgeModItems.COPPER_SWORD.get());
				tabData.accept(ReoredforgeModItems.COPPER_ARMOR_HELMET.get());
				tabData.accept(ReoredforgeModItems.COPPER_ARMOR_CHESTPLATE.get());
				tabData.accept(ReoredforgeModItems.COPPER_ARMOR_LEGGINGS.get());
				tabData.accept(ReoredforgeModItems.COPPER_ARMOR_BOOTS.get());
				tabData.accept(ReoredforgeModItems.SILVER_SWORD.get());
				tabData.accept(ReoredforgeModItems.SILVER_ARMOR_HELMET.get());
				tabData.accept(ReoredforgeModItems.SILVER_ARMOR_CHESTPLATE.get());
				tabData.accept(ReoredforgeModItems.SILVER_ARMOR_LEGGINGS.get());
				tabData.accept(ReoredforgeModItems.SILVER_ARMOR_BOOTS.get());
				tabData.accept(ReoredforgeModItems.DEEP_IRON_SWORD.get());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> REORED_TOOLS = REGISTRY.register("reored_tools",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.reoredforge.reored_tools")).icon(() -> new ItemStack(ReoredforgeModItems.DEEP_IRON_PICKAXE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(ReoredforgeModItems.COPPER_PICKAXE.get());
				tabData.accept(ReoredforgeModItems.COPPER_AXE.get());
				tabData.accept(ReoredforgeModItems.COPPER_SHOVEL.get());
				tabData.accept(ReoredforgeModItems.COPPER_HOE.get());
				tabData.accept(ReoredforgeModItems.SILVER_PICKAXE.get());
				tabData.accept(ReoredforgeModItems.SILVER_AXE.get());
				tabData.accept(ReoredforgeModItems.SILVER_SHOVEL.get());
				tabData.accept(ReoredforgeModItems.SILVER_HOE.get());
				tabData.accept(ReoredforgeModItems.DEEP_IRON_PICKAXE.get());
				tabData.accept(ReoredforgeModItems.DEEP_IRON_AXE.get());
				tabData.accept(ReoredforgeModItems.DEEP_IRON_SHOVEL.get());
				tabData.accept(ReoredforgeModItems.DEEP_IRON_HOE.get());
			})

					.build());
}
