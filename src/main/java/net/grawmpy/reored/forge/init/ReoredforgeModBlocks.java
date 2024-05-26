
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.grawmpy.reored.forge.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.grawmpy.reored.forge.block.SilverOreBlock;
import net.grawmpy.reored.forge.block.DeepslateSilverOreBlock;
import net.grawmpy.reored.forge.ReoredforgeMod;

public class ReoredforgeModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, ReoredforgeMod.MODID);
	public static final RegistryObject<Block> SILVER_ORE = REGISTRY.register("silver_ore", () -> new SilverOreBlock());
	public static final RegistryObject<Block> DEEPSLATE_SILVER_ORE = REGISTRY.register("deepslate_silver_ore", () -> new DeepslateSilverOreBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
