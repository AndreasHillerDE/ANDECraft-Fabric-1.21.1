package de.andreashiller.ahdecraft.world;

import de.andreashiller.ahdecraft.AHDECraft;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;

import java.util.List;

public class ModPlacedFeatures {

    public static final RegistryKey<PlacedFeature> RED_DIAMOND_ORE_PLACED_KEY = registerKey("red_diamond_ore_placed");
    public static final RegistryKey<PlacedFeature> RED_COAL_ORE_PLACED_KEY = registerKey("red_coal_ore_placed");
    public static final RegistryKey<PlacedFeature> PERIDOT_ORE_PLACED_KEY = registerKey("peridot_ore_placed");
    public static final RegistryKey<PlacedFeature> RUBY_ORE_PLACED_KEY = registerKey("ruby_ore_placed");
    public static final RegistryKey<PlacedFeature> SAPPIRE_ORE_PLACED_KEY = registerKey("sappire_ore_placed");

    public static final RegistryKey<PlacedFeature> RED_DIAMOND_NETHER_ORE_PLACED_KEY = registerKey("red_diamond_nether_ore_placed");
    public static final RegistryKey<PlacedFeature> RED_COAL_NETHER_ORE_PLACED_KEY = registerKey("red_coal_nether_ore_placed");
    public static final RegistryKey<PlacedFeature> PERIDOT_NETHER_ORE_PLACED_KEY = registerKey("peridot_nether_ore_placed");
    public static final RegistryKey<PlacedFeature> RUBY_NETHER_ORE_PLACED_KEY = registerKey("ruby_nether_ore_placed");
    public static final RegistryKey<PlacedFeature> SAPPHIRE_NETHER_ORE_PLACED_KEY = registerKey("sapphire_nether_ore_placed");

    public static void bootstrap(Registerable<PlacedFeature> context) {
        var configuredFeatures = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        // OVERWORLD
        register(context, RED_DIAMOND_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.RED_DIAMOND_ORE_KEY),
                ModOrePlacement.modifiersWithCount(10,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(25))));

        register(context, RED_COAL_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.RED_COAL_ORE_KEY),
                ModOrePlacement.modifiersWithCount(12,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(80))));

        register(context, PERIDOT_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.PERIDOT_ORE_KEY),
                ModOrePlacement.modifiersWithCount(5,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-25), YOffset.fixed(40))));

        register(context, RUBY_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.RUBY_ORE_KEY),
                ModOrePlacement.modifiersWithCount(5,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-25), YOffset.fixed(40))));

        register(context, SAPPIRE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.SAPPHIRE_ORE_KEY),
                ModOrePlacement.modifiersWithCount(5,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-25), YOffset.fixed(40))));

        // NETHER
        register(context, RED_DIAMOND_NETHER_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.RED_DIAMOND_NETHER_ORE_KEY),
                ModOrePlacement.modifiersWithCount(10,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(45))));

        register(context, RED_COAL_NETHER_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.RED_COAL_NETHER_ORE_KEY),
                ModOrePlacement.modifiersWithCount(12,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(40), YOffset.fixed(80))));

        register(context, PERIDOT_NETHER_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.PERIDOT_NETHER_ORE_KEY),
                ModOrePlacement.modifiersWithCount(4,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(64))));

        register(context, RUBY_NETHER_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.RUBY_NETHER_ORE_KEY),
                ModOrePlacement.modifiersWithCount(4,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(64))));

        register(context, SAPPHIRE_NETHER_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.SAPPHIRE_NETHER_ORE_KEY),
                ModOrePlacement.modifiersWithCount(4,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(64))));
    }

    public static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, Identifier.of(AHDECraft.MOD_ID, name));
    }

    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key,
                                                                                   RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                                                                   PlacementModifier... modifiers) {
        register(context, key, configuration, List.of(modifiers));
    }

}
