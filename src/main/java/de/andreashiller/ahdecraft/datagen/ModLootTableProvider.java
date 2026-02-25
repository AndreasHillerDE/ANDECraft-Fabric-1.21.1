package de.andreashiller.ahdecraft.datagen;


import de.andreashiller.ahdecraft.block.ModBlocks;
import de.andreashiller.ahdecraft.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.RED_DIAMOND_BLOCK);
        addDrop(ModBlocks.RED_DIAMOND_ORE, multipleOreDrops(ModBlocks.RED_DIAMOND_ORE, ModItems.RED_DIAMOND_DUST, 1f, 2f));
        addDrop(ModBlocks.RED_DIAMOND_DEEPSLATE_ORE, multipleOreDrops(ModBlocks.RED_DIAMOND_DEEPSLATE_ORE, ModItems.RED_DIAMOND_DUST, 1f, 2f));
        addDrop(ModBlocks.RED_DIAMOND_NETHER_ORE, multipleOreDrops(ModBlocks.RED_DIAMOND_NETHER_ORE, ModItems.RED_DIAMOND_INGOT, 2f, 4f));

        addDrop(ModBlocks.RED_COAL_BLOCK);
        addDrop(ModBlocks.RED_COAL_ORE, ModItems.RED_COAL);
        addDrop(ModBlocks.RED_COAL_DEEPSLATE_ORE, ModItems.RED_COAL);
        addDrop(ModBlocks.RED_COAL_NETHER_ORE, ModItems.RED_COAL);

        addDrop(ModBlocks.PERIDOT_BLOCK);
        addDrop(ModBlocks.PERIDOT_ORE, multipleOreDrops(ModBlocks.PERIDOT_ORE, ModItems.PERIDOT, 1f, 1f));
        addDrop(ModBlocks.PERIDOT_DEEPSLATE_ORE, multipleOreDrops(ModBlocks.PERIDOT_DEEPSLATE_ORE, ModItems.PERIDOT, 1f, 1f));
        addDrop(ModBlocks.PERIDOT_NETHER_ORE, multipleOreDrops(ModBlocks.PERIDOT_NETHER_ORE, ModItems.PERIDOT, 2f, 2f));

        addDrop(ModBlocks.RUBY_BLOCK);
        addDrop(ModBlocks.RUBY_ORE, multipleOreDrops(ModBlocks.RUBY_ORE, ModItems.RUBY, 1f, 1f));
        addDrop(ModBlocks.RUBY_DEEPSLATE_ORE, multipleOreDrops(ModBlocks.RUBY_DEEPSLATE_ORE, ModItems.RUBY, 1f, 1f));
        addDrop(ModBlocks.RUBY_NETHER_ORE, multipleOreDrops(ModBlocks.RUBY_NETHER_ORE, ModItems.RUBY, 2f, 2f));

        addDrop(ModBlocks.SAPPHIRE_BLOCK);
        addDrop(ModBlocks.SAPPHIRE_ORE, multipleOreDrops(ModBlocks.SAPPHIRE_ORE, ModItems.SAPPHIRE, 1f, 1f));
        addDrop(ModBlocks.SAPPHIRE_DEEPSLATE_ORE, multipleOreDrops(ModBlocks.SAPPHIRE_DEEPSLATE_ORE, ModItems.SAPPHIRE, 1f, 1f));
        addDrop(ModBlocks.SAPPHIRE_NETHER_ORE, multipleOreDrops(ModBlocks.SAPPHIRE_NETHER_ORE, ModItems.SAPPHIRE, 2f, 2f));

    }

    public LootTable.Builder multipleOreDrops(Block drop, Item item, float minCount, float maxCount) {
        RegistryWrapper.Impl<Enchantment> impl = this.registryLookup.getWrapperOrThrow(RegistryKeys.ENCHANTMENT);
        return this.dropsWithSilkTouch(drop, this.applyExplosionDecay(drop,((LeafEntry.Builder<?>)
                ItemEntry.builder(item).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(minCount, maxCount))))
                .apply(ApplyBonusLootFunction.oreDrops(impl.getOrThrow(Enchantments.FORTUNE)))));
    }
}
