
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.tamesproredux.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.bus.api.IEventBus;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.minecraft.core.registries.BuiltInRegistries;

import net.mcreator.tamesproredux.item.TitusBladeItem;
import net.mcreator.tamesproredux.item.SummoningMirrorItem;
import net.mcreator.tamesproredux.TamesProreduxMod;

public class TamesProreduxModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(BuiltInRegistries.ITEM, TamesProreduxMod.MODID);
	public static final DeferredHolder<Item, Item> SUMMONING_MIRROR = REGISTRY.register("summoning_mirror", () -> new SummoningMirrorItem());
	public static final DeferredHolder<Item, Item> TITUS_BLADE = REGISTRY.register("titus_blade", () -> new TitusBladeItem());
	public static final DeferredHolder<Item, Item> SAM_THE_WITCH_BLOCK = block(TamesProreduxModBlocks.SAM_THE_WITCH_BLOCK);

	// Start of user code block custom items
	// End of user code block custom items
	public static void register(IEventBus bus) {
		REGISTRY.register(bus);
	}

	private static DeferredHolder<Item, Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
