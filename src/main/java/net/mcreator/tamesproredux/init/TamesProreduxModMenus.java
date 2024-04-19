
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.tamesproredux.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.core.registries.Registries;

import net.mcreator.tamesproredux.world.inventory.SMTemplateGUIMenu;
import net.mcreator.tamesproredux.world.inventory.ReduxStartMenu;
import net.mcreator.tamesproredux.TamesProreduxMod;

public class TamesProreduxModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(Registries.MENU, TamesProreduxMod.MODID);
	public static final DeferredHolder<MenuType<?>, MenuType<ReduxStartMenu>> REDUX_START = REGISTRY.register("redux_start", () -> IMenuTypeExtension.create(ReduxStartMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<SMTemplateGUIMenu>> SM_TEMPLATE_GUI = REGISTRY.register("sm_template_gui", () -> IMenuTypeExtension.create(SMTemplateGUIMenu::new));
}
