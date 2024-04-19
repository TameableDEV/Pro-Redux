package net.mcreator.tamesproredux.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.arguments.EntityArgument;
import net.minecraft.commands.CommandSourceStack;

import net.mcreator.tamesproredux.network.TamesProreduxModVariables;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.DoubleArgumentType;

public class ReduxClassCommandProcedureProcedure {
	public static void execute(CommandContext<CommandSourceStack> arguments, Entity entity) {
		if (entity == null)
			return;
		try {
			for (Entity entityiterator : EntityArgument.getEntities(arguments, "Player")) {
				if (DoubleArgumentType.getDouble(arguments, "Class") == 0) {
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("Class Changed to: None"), true);
					{
						TamesProreduxModVariables.PlayerVariables _vars = entity.getData(TamesProreduxModVariables.PLAYER_VARIABLES);
						_vars.PlayerReduxClass = 0;
						_vars.syncPlayerVariables(entity);
					}
				} else if (DoubleArgumentType.getDouble(arguments, "Class") == 1) {
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("Class Changed to: Melee (1)"), true);
					{
						TamesProreduxModVariables.PlayerVariables _vars = entity.getData(TamesProreduxModVariables.PLAYER_VARIABLES);
						_vars.PlayerReduxClass = 1;
						_vars.syncPlayerVariables(entity);
					}
				} else if (DoubleArgumentType.getDouble(arguments, "Class") == 2) {
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("Class Changed to: Ranged (2)"), true);
					{
						TamesProreduxModVariables.PlayerVariables _vars = entity.getData(TamesProreduxModVariables.PLAYER_VARIABLES);
						_vars.PlayerReduxClass = 2;
						_vars.syncPlayerVariables(entity);
					}
				} else if (DoubleArgumentType.getDouble(arguments, "Class") == 3) {
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("Class Changed to: Summon (3)"), true);
					{
						TamesProreduxModVariables.PlayerVariables _vars = entity.getData(TamesProreduxModVariables.PLAYER_VARIABLES);
						_vars.PlayerReduxClass = 3;
						_vars.syncPlayerVariables(entity);
					}
				} else if (DoubleArgumentType.getDouble(arguments, "Class") == 4) {
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("Class Changed to: (4)"), true);
					{
						TamesProreduxModVariables.PlayerVariables _vars = entity.getData(TamesProreduxModVariables.PLAYER_VARIABLES);
						_vars.PlayerReduxClass = 4;
						_vars.syncPlayerVariables(entity);
					}
				}
			}
		} catch (CommandSyntaxException e) {
			e.printStackTrace();
		}
	}
}
