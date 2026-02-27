package de.andreashiller.ahdecraft.item;

import de.andreashiller.ahdecraft.AHDECraft;
import de.andreashiller.ahdecraft.item.custom.ConversionBall;
import de.andreashiller.ahdecraft.item.custom.ConversionWand;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class ModItems {

    public static final Item RED_DIAMOND = registerItem("red_diamond", new Item(new Item.Settings()));
    public static final Item RED_DIAMOND_INGOT = registerItem("red_diamond_ingot", new Item(new Item.Settings()));
    public static final Item RED_DIAMOND_NUGGET = registerItem("red_diamond_nugget", new Item(new Item.Settings()));
    public static final Item RED_DIAMOND_DUST = registerItem("red_diamond_dust", new Item(new Item.Settings()));
    public static final Item RED_COAL = registerItem("red_coal", new Item(new Item.Settings()));
    public static final Item CONVERSION_BALL = registerItem("conversion_ball", new ConversionBall(new Item.Settings().maxDamage(1024).maxCount(1)));
    public static final Item CONVERSION_WAND = registerItem("conversion_wand", new ConversionWand(new Item.Settings().maxDamage(1024)));
    public static final Item PERIDOT = registerItem("peridot", new Item(new Item.Settings()));
    public static final Item RUBY = registerItem("ruby", new Item(new Item.Settings()));
    public static final Item SAPPHIRE = registerItem("sapphire", new Item(new Item.Settings()));

    // TOOLS
    public static final Item RED_DIAMOND_AXE = registerItem("red_diamond_axe",
            new AxeItem(ModToolMaterials.RED_DIAMOND, new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.RED_DIAMOND, 6, -3.2f))));

    public static final Item RED_DIAMOND_PICKAXE = registerItem("red_diamond_pickaxe",
            new PickaxeItem(ModToolMaterials.RED_DIAMOND, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.RED_DIAMOND, 1, -2.8f))));

    public static final Item RED_DIAMOND_SHOVEL = registerItem("red_diamond_shovel",
            new ShovelItem(ModToolMaterials.RED_DIAMOND, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.RED_DIAMOND, 1.5F, -3f))));

    public static final Item RED_DIAMOND_HOE = registerItem("red_diamond_hoe",
            new HoeItem(ModToolMaterials.RED_DIAMOND, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.RED_DIAMOND, 0, -3.0f))));

    public static final Item RED_DIAMOND_SWORD = registerItem("red_diamond_sword",
            new SwordItem(ModToolMaterials.RED_DIAMOND, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.RED_DIAMOND, 3, -2.4f))));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(AHDECraft.MOD_ID, name), item);
    }

    public static void registerModItems() {
        AHDECraft.LOGGER.info("Registering mod items for " + AHDECraft.MOD_ID + ". A mod made by AndreasHillerDE");
    }



}
