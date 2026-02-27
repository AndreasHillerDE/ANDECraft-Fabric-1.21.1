package de.andreashiller.ahdecraft.datagen;

import de.andreashiller.ahdecraft.block.ModBlocks;
import de.andreashiller.ahdecraft.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {

    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RED_DIAMOND_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RED_DIAMOND_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RED_DIAMOND_DEEPSLATE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RED_DIAMOND_NETHER_ORE);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RED_COAL_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RED_COAL_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RED_COAL_DEEPSLATE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RED_COAL_NETHER_ORE);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PERIDOT_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PERIDOT_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PERIDOT_DEEPSLATE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PERIDOT_NETHER_ORE);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RUBY_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RUBY_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RUBY_DEEPSLATE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RUBY_NETHER_ORE);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SAPPHIRE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SAPPHIRE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SAPPHIRE_DEEPSLATE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SAPPHIRE_NETHER_ORE);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.CONVERSION_BALL, Models.GENERATED);
        itemModelGenerator.register(ModItems.CONVERSION_WAND, Models.GENERATED);
        itemModelGenerator.register(ModItems.RED_DIAMOND, Models.GENERATED);
        itemModelGenerator.register(ModItems.RED_DIAMOND_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.RED_DIAMOND_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ModItems.RED_DIAMOND_DUST, Models.GENERATED);
        itemModelGenerator.register(ModItems.RED_COAL, Models.GENERATED);
        itemModelGenerator.register(ModItems.PERIDOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.RUBY, Models.GENERATED);
        itemModelGenerator.register(ModItems.SAPPHIRE, Models.GENERATED);
        itemModelGenerator.register(ModItems.RED_DIAMOND_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.RED_DIAMOND_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.RED_DIAMOND_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.RED_DIAMOND_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.RED_DIAMOND_SWORD, Models.HANDHELD);
    }
}
