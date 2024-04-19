package net.mcreator.tamesproredux.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.tamesproredux.world.inventory.ReduxStartMenu;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class ReduxStartScreen extends AbstractContainerScreen<ReduxStartMenu> {
	private final static HashMap<String, Object> guistate = ReduxStartMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_start_redux_run;

	public ReduxStartScreen(ReduxStartMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 277;
		this.imageHeight = 227;
	}

	@Override
	public boolean isPauseScreen() {
		return true;
	}

	private static final ResourceLocation texture = new ResourceLocation("tames_proredux:textures/screens/redux_start.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics, mouseX, mouseY, partialTicks);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.tames_proredux.redux_start.label_welcome_to_redux"), 3, 10, -16777216, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.tames_proredux.redux_start.label_this_mod_changes_how_you_play_mi"), 3, 19, -16777216, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.tames_proredux.redux_start.label_in_which_i_threw_out_90_of_the"), 3, 28, -16777216, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.tames_proredux.redux_start.label_this_sandbox_game_not_literally"), 3, 37, -16777216, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.tames_proredux.redux_start.label_linear_youre_still_able_to_do"), 3, 46, -16777216, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.tames_proredux.redux_start.label_but_you_might_need_to_complete_s"), 3, 55, -16777216, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.tames_proredux.redux_start.label_anyways_see_ya_later"), 3, 64, -16777216, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.tames_proredux.redux_start.label_note_this_gui_is_a_placeholder"), 3, 127, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.tames_proredux.redux_start.label_later_this_mod_is_still_in_a_ea"), 3, 136, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.tames_proredux.redux_start.label_subjected_to_change_in_future_up"), 3, 145, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.tames_proredux.redux_start.label_with_said_future_updates_may_not"), 3, 154, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.tames_proredux.redux_start.label_tameable_main_dev_of_redux"), 57, 91, -16777216, false);
	}

	@Override
	public void init() {
		super.init();
		button_start_redux_run = Button.builder(Component.translatable("gui.tames_proredux.redux_start.button_start_redux_run"), e -> {
		}).bounds(this.leftPos + 84, this.topPos + 199, 103, 20).build();
		guistate.put("button:button_start_redux_run", button_start_redux_run);
		this.addRenderableWidget(button_start_redux_run);
	}
}
