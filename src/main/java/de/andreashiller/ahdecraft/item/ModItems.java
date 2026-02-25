package de.andreashiller.ahdecraft.item;

import de.andreashiller.ahdecraft.AHDECraft;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class ModItems {

    public static final Item RED_DIAMOND = registerItem("red_diamond", new Item(new Item.Settings()));
    public static final Item RED_DIAMOND_INGOT = registerItem("red_diamond_ingot", new Item(new Item.Settings()));
    public static final Item RED_DIAMOND_NUGGET = registerItem("red_diamond_nugget", new Item(new Item.Settings()));
    public static final Item RED_DIAMOND_DUST = registerItem("red_diamond_dust", new Item(new Item.Settings()));
    public static final Item RED_COAL = registerItem("red_coal", new Item(new Item.Settings()));
    public static final Item CONVERSION_BALL = registerItem("conversion_ball", new Item(new Item.Settings()));
    public static final Item CONVERSION_WAND = registerItem("conversion_wand", new Item(new Item.Settings()));
    public static final Item PERIDOT = registerItem("peridot", new Item(new Item.Settings()));
    public static final Item RUBY = registerItem("ruby", new Item(new Item.Settings()));
    public static final Item SAPPHIRE = registerItem("sapphire", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(AHDECraft.MOD_ID, name), item);
    }

    public static void registerModItems() {
        AHDECraft.LOGGER.info("Registering mod items for " + AHDECraft.MOD_ID + ". A mod made by AndreasHillerDE");
    }



}
