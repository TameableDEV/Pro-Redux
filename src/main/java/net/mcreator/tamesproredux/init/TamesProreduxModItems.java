
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.tamesproredux.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.bus.api.IEventBus;

import net.minecraft.world.item.Item;
import net.minecraft.core.registries.BuiltInRegistries;

import net.mcreator.tamesproredux.item.TitusBladeItem;
import net.mcreator.tamesproredux.item.SummoningMirrorItem;
import net.mcreator.tamesproredux.TamesProreduxMod;

public class TamesProreduxModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(BuiltInRegistries.ITEM, TamesProreduxMod.MODID);
	public static final DeferredHolder<Item, Item> SUMMONING_MIRROR = REGISTRY.register("summoning_mirror", () -> new SummoningMirrorItem());
	public static final DeferredHolder<Item, Item> TITUS_BLADE = REGISTRY.register("titus_blade", () -> new TitusBladeItem());

	// Start of user code block custom items
	// End of user code block custom items
	public static void register(IEventBus bus) {
		REGISTRY.register(bus);
	}
}
