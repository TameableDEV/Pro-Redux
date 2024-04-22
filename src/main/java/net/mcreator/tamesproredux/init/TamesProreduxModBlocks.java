
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.tamesproredux.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.core.registries.BuiltInRegistries;

import net.mcreator.tamesproredux.block.SamTheWitchBlockBlock;
import net.mcreator.tamesproredux.TamesProreduxMod;

public class TamesProreduxModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(BuiltInRegistries.BLOCK, TamesProreduxMod.MODID);
	public static final DeferredHolder<Block, Block> SAM_THE_WITCH_BLOCK = REGISTRY.register("sam_the_witch_block", () -> new SamTheWitchBlockBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
