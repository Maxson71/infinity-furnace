package com.maxson.infinityfurnace.blocks;

import com.maxson.infinityfurnace.InfinityFurnace;
import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import static net.minecraft.block.Blocks.createLightLevelFromLitBlockState;


public class ModBlocks {
    public static final Block INFINITY_FURNACE = registerBlock("infinity_furnace",
            new BlastFurnaceBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.STONE_GRAY)
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .requiresTool()
                            .strength(3.5F)
                            .luminance(createLightLevelFromLitBlockState(13))
            ));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.tryParse(InfinityFurnace.MOD_ID + ":" + name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, Identifier.tryParse(InfinityFurnace.MOD_ID + ":" + name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        InfinityFurnace.LOGGER.info("Registering ModBLocks for " + InfinityFurnace.MOD_ID);
    }
}
