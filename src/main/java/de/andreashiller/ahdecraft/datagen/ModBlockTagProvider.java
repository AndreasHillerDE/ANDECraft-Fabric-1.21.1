package de.andreashiller.ahdecraft.datagen;

import de.andreashiller.ahdecraft.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {

    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.RED_DIAMOND_BLOCK)
                .add(ModBlocks.RED_DIAMOND_ORE)
                .add(ModBlocks.RED_DIAMOND_DEEPSLATE_ORE)
                .add(ModBlocks.RED_DIAMOND_NETHER_ORE)
                .add(ModBlocks.RED_COAL_ORE)
                .add(ModBlocks.RED_COAL_DEEPSLATE_ORE)
                .add(ModBlocks.RED_COAL_NETHER_ORE)
                .add(ModBlocks.RED_COAL_BLOCK)
                .add(ModBlocks.PERIDOT_BLOCK)
                .add(ModBlocks.PERIDOT_ORE)
                .add(ModBlocks.PERIDOT_DEEPSLATE_ORE)
                .add(ModBlocks.PERIDOT_NETHER_ORE)
                .add(ModBlocks.RUBY_BLOCK)
                .add(ModBlocks.RUBY_ORE)
                .add(ModBlocks.RUBY_DEEPSLATE_ORE)
                .add(ModBlocks.RUBY_NETHER_ORE)
                .add(ModBlocks.SAPPHIRE_BLOCK)
                .add(ModBlocks.SAPPHIRE_ORE)
                .add(ModBlocks.SAPPHIRE_DEEPSLATE_ORE)
                .add(ModBlocks.SAPPHIRE_NETHER_ORE);


        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.RED_DIAMOND_BLOCK)
                .add(ModBlocks.RED_DIAMOND_ORE)
                .add(ModBlocks.RED_DIAMOND_DEEPSLATE_ORE)
                .add(ModBlocks.RED_DIAMOND_NETHER_ORE)
                .add(ModBlocks.PERIDOT_BLOCK)
                .add(ModBlocks.PERIDOT_ORE)
                .add(ModBlocks.PERIDOT_DEEPSLATE_ORE)
                .add(ModBlocks.PERIDOT_NETHER_ORE)
                .add(ModBlocks.RUBY_BLOCK)
                .add(ModBlocks.RUBY_ORE)
                .add(ModBlocks.RUBY_DEEPSLATE_ORE)
                .add(ModBlocks.RUBY_NETHER_ORE)
                .add(ModBlocks.SAPPHIRE_BLOCK)
                .add(ModBlocks.SAPPHIRE_ORE)
                .add(ModBlocks.SAPPHIRE_DEEPSLATE_ORE)
                .add(ModBlocks.SAPPHIRE_NETHER_ORE);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.RED_COAL_ORE)
                .add(ModBlocks.RED_COAL_DEEPSLATE_ORE)
                .add(ModBlocks.RED_COAL_NETHER_ORE)
                .add(ModBlocks.RED_COAL_BLOCK);

    }
}
