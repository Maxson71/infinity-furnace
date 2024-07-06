package com.maxson.infinityfurnace.blocks.entity;

import com.maxson.infinityfurnace.InfinityFurnace;
import com.maxson.infinityfurnace.blocks.ModBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlockEntity {
    public static final BlockEntityType<InfinityFurnaceEntity> INFINITY_FURNACE =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(InfinityFurnace.MOD_ID, "infinity_furnace"),
                    FabricBlockEntityTypeBuilder.create(InfinityFurnaceEntity::new,
                            ModBlocks.INFINITY_FURNACE).build());

    public static void registerBlockEntities() {
        InfinityFurnace.LOGGER.info("Registering Block Entities for " + InfinityFurnace.MOD_ID);
    }
}
