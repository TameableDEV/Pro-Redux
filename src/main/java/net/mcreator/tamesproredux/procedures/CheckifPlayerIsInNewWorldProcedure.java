package net.mcreator.tamesproredux.procedures;

import net.neoforged.neoforge.event.entity.player.PlayerEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

import net.mcreator.tamesproredux.network.TamesProreduxModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class CheckifPlayerIsInNewWorldProcedure {
	@SubscribeEvent
	public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
		execute(event, event.getEntity().level(), event.getEntity());
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((!(entity instanceof ServerPlayer _plr0 && _plr0.level() instanceof ServerLevel && _plr0.getAdvancements().getOrStartProgress(_plr0.server.getAdvancements().get(new ResourceLocation("minecraft:story/root"))).isDone())
				|| !(entity instanceof ServerPlayer _plr1 && _plr1.level() instanceof ServerLevel && _plr1.getAdvancements().getOrStartProgress(_plr1.server.getAdvancements().get(new ResourceLocation("minecraft:adventure/root"))).isDone())
				|| !(entity instanceof ServerPlayer _plr2 && _plr2.level() instanceof ServerLevel && _plr2.getAdvancements().getOrStartProgress(_plr2.server.getAdvancements().get(new ResourceLocation("minecraft:end/root"))).isDone())
				|| !(entity instanceof ServerPlayer _plr3 && _plr3.level() instanceof ServerLevel && _plr3.getAdvancements().getOrStartProgress(_plr3.server.getAdvancements().get(new ResourceLocation("minecraft:husbandry/root"))).isDone())
				|| !(entity instanceof ServerPlayer _plr4 && _plr4.level() instanceof ServerLevel && _plr4.getAdvancements().getOrStartProgress(_plr4.server.getAdvancements().get(new ResourceLocation("minecraft:nether/root"))).isDone()))
				&& TamesProreduxModVariables.MapVariables.get(world).ReduxChatSeen == false) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(
						"\u00A7f\u00A7oTameable here, it seems you got My Pro-Redux Mod installed. I want to state that if your playing on a world with progress already made on it (example: you have iron armor or a base) I recommend making a New World for the reason of not losing any items in your inventory. anyways, just use \u00A7r\u00A76\u00A7l\u00A7o/Redux \u00A7r\u00A7f\u00A7ocommand to begin."),
						false);
			TamesProreduxModVariables.MapVariables.get(world).ReduxChatSeen = true;
			TamesProreduxModVariables.MapVariables.get(world).syncData(world);
		}
	}
}
