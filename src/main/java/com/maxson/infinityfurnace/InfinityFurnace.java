package com.maxson.infinityfurnace;

import com.maxson.infinityfurnace.blocks.ModBlocks;
import com.maxson.infinityfurnace.blocks.entity.ModBlockEntities;
import com.maxson.infinityfurnace.screen.ModScreenHandlers;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InfinityFurnace implements ModInitializer {
	public static final String MOD_ID = "infinityfurnace";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModBlocks.registerModBlocks();
		ModBlockEntities.registerBlockEntities();
		ModScreenHandlers.registerScreenHandlers();
	}
}