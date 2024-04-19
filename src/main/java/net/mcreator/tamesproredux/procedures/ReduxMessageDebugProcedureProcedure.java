package net.mcreator.tamesproredux.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.tamesproredux.network.TamesProreduxModVariables;

public class ReduxMessageDebugProcedureProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (TamesProreduxModVariables.MapVariables.get(world).ReduxChatSeen == true) {
			TamesProreduxModVariables.MapVariables.get(world).ReduxChatSeen = false;
			TamesProreduxModVariables.MapVariables.get(world).syncData(world);
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7lThe Redux Chat Notification has been reset! Reload the world to see the message again! -Tameable."), false);
		}
	}
}
