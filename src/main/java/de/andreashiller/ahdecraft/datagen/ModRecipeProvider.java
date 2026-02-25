package de.andreashiller.ahdecraft.datagen;

import de.andreashiller.ahdecraft.block.ModBlocks;
import de.andreashiller.ahdecraft.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {

        // Smelting and Blasing
        List<ItemConvertible> RED_DIAMOND_SMELTABLES = List.of(
                ModItems.RED_DIAMOND_DUST,
                ModBlocks.RED_DIAMOND_ORE,
                ModBlocks.RED_DIAMOND_DEEPSLATE_ORE,
                ModBlocks.RED_DIAMOND_NETHER_ORE
        );

        offerSmelting(exporter, RED_DIAMOND_SMELTABLES, RecipeCategory.MISC, ModItems.RED_DIAMOND_INGOT, 0.1f, 200, "red_diamond_ingot");
        offerBlasting(exporter, RED_DIAMOND_SMELTABLES, RecipeCategory.MISC, ModItems.RED_DIAMOND_INGOT, 0.1f, 100, "red_diamond_ingot");


        // Craft Red Diamond Block
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.RED_DIAMOND_BLOCK)
                .pattern("RRR")
                .pattern("RRR")
                .pattern("RRR")
                .input('R', ModItems.RED_DIAMOND_INGOT)
                .criterion(hasItem(ModItems.RED_DIAMOND_INGOT), conditionsFromItem(ModItems.RED_DIAMOND_INGOT))
                .offerTo(exporter);

        // Craft Red Coal Block
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.RED_COAL_BLOCK)
                .pattern("RRR")
                .pattern("RRR")
                .pattern("RRR")
                .input('R', ModItems.RED_COAL)
                .criterion(hasItem(ModItems.RED_COAL), conditionsFromItem(ModItems.RED_COAL))
                .offerTo(exporter);

        // Craft Red Diamond
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RED_DIAMOND)
                .pattern(" R ")
                .pattern("RDR")
                .pattern(" R ")
                .input('R', ModItems.RED_DIAMOND_INGOT)
                .input('D', Items.DIAMOND)
                .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter);

        // Craft Conversion Ball
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CONVERSION_BALL)
                .pattern("RRR")
                .pattern("RSR")
                .pattern("RRR")
                .input('S', Items.SLIME_BALL)
                .input('R', ModItems.RED_DIAMOND)
                .criterion(hasItem(ModItems.RED_DIAMOND), conditionsFromItem(ModItems.RED_DIAMOND))
                .offerTo(exporter);

        // Craft Conversion Wand
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CONVERSION_WAND)
                .pattern(" C")
                .pattern("S ")
                .input('C', ModItems.CONVERSION_BALL)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.CONVERSION_BALL), conditionsFromItem(ModItems.CONVERSION_BALL))
                .offerTo(exporter);

        // Craft Torches * 2
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Items.TORCH,8)
                .pattern("R")
                .pattern("S")
                .input('R', ModItems.RED_COAL)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.RED_COAL), conditionsFromItem(ModItems.RED_COAL))
                .offerTo(exporter);

        // Craft Peridot Block
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.PERIDOT_BLOCK)
                .pattern("PPP")
                .pattern("PPP")
                .pattern("PPP")
                .input('P', ModItems.PERIDOT)
                .criterion(hasItem(ModItems.PERIDOT), conditionsFromItem(ModItems.PERIDOT))
                .offerTo(exporter);

        // Craft Ruby Block
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.RUBY_BLOCK)
                .pattern("RRR")
                .pattern("RRR")
                .pattern("RRR")
                .input('R', ModItems.RUBY)
                .criterion(hasItem(ModItems.RUBY), conditionsFromItem(ModItems.RUBY))
                .offerTo(exporter);

        // Craft Sapphire Block
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.SAPPHIRE_BLOCK)
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .input('S', ModItems.SAPPHIRE)
                .criterion(hasItem(ModItems.SAPPHIRE), conditionsFromItem(ModItems.SAPPHIRE))
                .offerTo(exporter);

        // Craft Red Diamond Ingot
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RED_DIAMOND_INGOT, 9)
                .input(ModBlocks.RED_DIAMOND_BLOCK)
                .criterion(hasItem(ModBlocks.RED_DIAMOND_BLOCK),  conditionsFromItem(ModBlocks.RED_DIAMOND_BLOCK))
                .offerTo(exporter);

        // Craft Red Coal
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RED_COAL, 9)
                .input(ModBlocks.RED_COAL_BLOCK)
                .criterion(hasItem(ModBlocks.RED_COAL_BLOCK),  conditionsFromItem(ModBlocks.RED_COAL_BLOCK))
                .offerTo(exporter);

        // Craft Peridot
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.PERIDOT, 9)
                .input(ModBlocks.PERIDOT_BLOCK)
                .criterion(hasItem(ModBlocks.PERIDOT_BLOCK),  conditionsFromItem(ModBlocks.PERIDOT_BLOCK))
                .offerTo(exporter);

        // Craft Ruby
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RUBY, 9)
                .input(ModBlocks.RUBY_BLOCK)
                .criterion(hasItem(ModBlocks.RUBY_BLOCK),  conditionsFromItem(ModBlocks.RUBY_BLOCK))
                .offerTo(exporter);

        // Craft Sapphire
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SAPPHIRE, 9)
                .input(ModBlocks.SAPPHIRE_BLOCK)
                .criterion(hasItem(ModBlocks.SAPPHIRE_BLOCK),  conditionsFromItem(ModBlocks.SAPPHIRE_BLOCK))
                .offerTo(exporter);
    }
}
