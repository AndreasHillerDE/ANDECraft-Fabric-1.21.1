package de.andreashiller.ahdecraft.world;

import de.andreashiller.ahdecraft.AHDECraft;
import de.andreashiller.ahdecraft.block.ModBlocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.*;

import java.util.List;

public class ModConfiguredFeatures {

    public static final RegistryKey<ConfiguredFeature<?, ?>> RED_DIAMOND_ORE_KEY = registerKey("red_diamond_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> RED_COAL_ORE_KEY = registerKey("red_coal_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PERIDOT_ORE_KEY = registerKey("peridot_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> RUBY_ORE_KEY = registerKey("ruby_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> SAPPHIRE_ORE_KEY = registerKey("sapphire_ore");

    public static final RegistryKey<ConfiguredFeature<?, ?>> RED_DIAMOND_NETHER_ORE_KEY = registerKey("red_diamond_nether_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> RED_COAL_NETHER_ORE_KEY = registerKey("red_coal_nether_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PERIDOT_NETHER_ORE_KEY = registerKey("peridot_nether_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> RUBY_NETHER_ORE_KEY = registerKey("ruby_nether_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> SAPPHIRE_NETHER_ORE_KEY = registerKey("sapphire_nether_ore");


    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplaceables = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest netherReplaceables = new TagMatchRuleTest(BlockTags.BASE_STONE_NETHER);
        //RuleTest endReplaceables = new BlockMatchRuleTest(Blocks.END_STONE);

        // OVERWORLD ORES
        List<OreFeatureConfig.Target> overworldRedDiamondOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.RED_DIAMOND_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.RED_DIAMOND_DEEPSLATE_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldRedCoalOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.RED_COAL_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.RED_COAL_DEEPSLATE_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldPeridotOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.PERIDOT_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.PERIDOT_DEEPSLATE_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldRubyOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.RUBY_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.RUBY_DEEPSLATE_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldSapphireOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.SAPPHIRE_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.SAPPHIRE_DEEPSLATE_ORE.getDefaultState()));


        // NETHER ORES
        List<OreFeatureConfig.Target> netherRedDiamondOres =
                List.of(OreFeatureConfig.createTarget(netherReplaceables, ModBlocks.RED_DIAMOND_NETHER_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> netherRedCoalOres =
                List.of(OreFeatureConfig.createTarget(netherReplaceables, ModBlocks.RED_COAL_NETHER_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> netherPeridotOres =
                List.of(OreFeatureConfig.createTarget(netherReplaceables, ModBlocks.PERIDOT_NETHER_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> netherRubyOres =
                List.of(OreFeatureConfig.createTarget(netherReplaceables, ModBlocks.RUBY_NETHER_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> netherSapphireOres =
                List.of(OreFeatureConfig.createTarget(netherReplaceables, ModBlocks.SAPPHIRE_NETHER_ORE.getDefaultState()));

        // REGISTERING OVERWORLD ORES
        register(context, RED_DIAMOND_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldRedDiamondOres, 6));
        register(context, RED_COAL_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldRedCoalOres, 10));
        register(context, PERIDOT_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldPeridotOres, 5));
        register(context, RUBY_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldRubyOres, 5));
        register(context, SAPPHIRE_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldSapphireOres, 5));

        // REGISTERING NETHER ORES
        register(context, RED_DIAMOND_NETHER_ORE_KEY, Feature.ORE, new OreFeatureConfig(netherRedDiamondOres, 5));
        register(context, RED_COAL_NETHER_ORE_KEY, Feature.ORE, new OreFeatureConfig(netherRedCoalOres, 9));
        register(context, PERIDOT_NETHER_ORE_KEY, Feature.ORE, new OreFeatureConfig(netherPeridotOres, 4));
        register(context, RUBY_NETHER_ORE_KEY, Feature.ORE, new OreFeatureConfig(netherRubyOres, 4));
        register(context, SAPPHIRE_NETHER_ORE_KEY, Feature.ORE, new OreFeatureConfig(netherSapphireOres, 4));


    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(AHDECraft.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }

}
