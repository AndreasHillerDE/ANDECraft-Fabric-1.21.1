package de.andreashiller.ahdecraft.item;

import de.andreashiller.ahdecraft.AHDECraft;
import de.andreashiller.ahdecraft.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup AHDECraft_ITEM_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(AHDECraft.MOD_ID, "ahdecraft_item_group"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.CONVERSION_BALL))
                    .displayName(Text.translatable("itemgroup.ahdecraft.ahdecraft_item_group"))
                    .entries((displayContext, entries) -> {
                        // Items
                        entries.add(ModItems.RED_DIAMOND);
                        entries.add(ModItems.RED_DIAMOND_INGOT);
                        entries.add(ModItems.RED_DIAMOND_NUGGET);
                        entries.add(ModItems.RED_DIAMOND_DUST);
                        entries.add(ModItems.RED_COAL);
                        entries.add(ModItems.CONVERSION_BALL);
                        entries.add(ModItems.CONVERSION_WAND);
                        entries.add(ModItems.PERIDOT);
                        entries.add(ModItems.RUBY);
                        entries.add(ModItems.SAPPHIRE);
                    }).build());

    public static final ItemGroup AHDECraft_BLOCK_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(AHDECraft.MOD_ID, "ahdecraft_block_group"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.RED_DIAMOND_BLOCK))
                    .displayName(Text.translatable("itemgroup.ahdecraft.ahdecraft_block_group"))
                    .entries((displayContext, entries) -> {
                        // Blocks
                        entries.add(ModBlocks.RED_DIAMOND_BLOCK);
                        entries.add(ModBlocks.RED_DIAMOND_ORE);
                        entries.add(ModBlocks.RED_DIAMOND_DEEPSLATE_ORE);
                        entries.add(ModBlocks.RED_DIAMOND_NETHER_ORE);
                        entries.add(ModBlocks.RED_COAL_BLOCK);
                        entries.add(ModBlocks.RED_COAL_ORE);
                        entries.add(ModBlocks.RED_COAL_DEEPSLATE_ORE);
                        entries.add(ModBlocks.RED_COAL_NETHER_ORE);
                        entries.add(ModBlocks.PERIDOT_BLOCK);
                        entries.add(ModBlocks.PERIDOT_ORE);
                        entries.add(ModBlocks.PERIDOT_DEEPSLATE_ORE);
                        entries.add(ModBlocks.PERIDOT_NETHER_ORE);
                        entries.add(ModBlocks.RUBY_BLOCK);
                        entries.add(ModBlocks.RUBY_ORE);
                        entries.add(ModBlocks.RUBY_DEEPSLATE_ORE);
                        entries.add(ModBlocks.RUBY_NETHER_ORE);
                        entries.add(ModBlocks.SAPPHIRE_BLOCK);
                        entries.add(ModBlocks.SAPPHIRE_ORE);
                        entries.add(ModBlocks.SAPPHIRE_DEEPSLATE_ORE);
                        entries.add(ModBlocks.SAPPHIRE_NETHER_ORE);
                    }).build());

    public static void registerItemGroups() {
        AHDECraft.LOGGER.info("Registering item groups for " + AHDECraft.MOD_ID + ". A mod made by AndreasHillerDE");
    }


}
