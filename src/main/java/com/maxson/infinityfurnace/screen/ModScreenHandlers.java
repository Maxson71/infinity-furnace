package com.maxson.infinityfurnace.screen;

import com.maxson.infinityfurnace.InfinityFurnace;
import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;

public class ModScreenHandlers {
    public static final ScreenHandlerType<InfinityFurnaceScreenHandler> INFINITY_FURNACE_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, Identifier.of(InfinityFurnace.MOD_ID, "infinity_furnace"),
                    new ExtendedScreenHandlerType<>(InfinityFurnaceScreenHandler::new));

    public static void registerScreenHandlers() {
        InfinityFurnace.LOGGER.info("Registering Screen Handlers for " + InfinityFurnace.MOD_ID);
    }
}