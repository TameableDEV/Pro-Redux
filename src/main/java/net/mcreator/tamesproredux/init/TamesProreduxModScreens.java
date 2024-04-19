
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.tamesproredux.init;

import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.tamesproredux.client.gui.SMTemplateGUIScreen;
import net.mcreator.tamesproredux.client.gui.ReduxStartScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class TamesProreduxModScreens {
	@SubscribeEvent
	public static void clientLoad(RegisterMenuScreensEvent event) {
		event.register(TamesProreduxModMenus.REDUX_START.get(), ReduxStartScreen::new);
		event.register(TamesProreduxModMenus.SM_TEMPLATE_GUI.get(), SMTemplateGUIScreen::new);
	}
}
