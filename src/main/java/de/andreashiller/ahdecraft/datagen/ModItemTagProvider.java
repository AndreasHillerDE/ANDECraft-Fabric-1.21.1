package de.andreashiller.ahdecraft.datagen;

import de.andreashiller.ahdecraft.item.ModItems;
import de.andreashiller.ahdecraft.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {

    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ModTags.Items.TRANSFORMABLE_ITEMS);

        getOrCreateTagBuilder(ItemTags.AXES).add(ModItems.RED_DIAMOND_AXE);
        getOrCreateTagBuilder(ItemTags.PICKAXES).add(ModItems.RED_DIAMOND_PICKAXE);
        getOrCreateTagBuilder(ItemTags.SHOVELS).add(ModItems.RED_DIAMOND_SHOVEL);
        getOrCreateTagBuilder(ItemTags.HOES).add(ModItems.RED_DIAMOND_HOE);
        getOrCreateTagBuilder(ItemTags.SWORDS).add(ModItems.RED_DIAMOND_SWORD);

    }
}
