package com.maxson.infinityfurnace;

import com.maxson.infinityfurnace.screen.ModScreenHandlers;
import com.maxson.infinityfurnace.screen.InfinityFurnaceScreen;
import com.maxson.infinityfurnace.blocks.entity.ModBlockEntities;

import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactories;

public class InfinityFurnaceClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		HandledScreens.register(ModScreenHandlers.INFINITY_FURNACE_SCREEN_HANDLER, InfinityFurnaceScreen::new);
	}
}