package de.andreashiller.ahdecraft;

import de.andreashiller.ahdecraft.block.ModBlocks;
import de.andreashiller.ahdecraft.item.ModItemGroups;
import de.andreashiller.ahdecraft.item.ModItems;
import de.andreashiller.ahdecraft.world.gen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AHDECraft implements ModInitializer {
	public static final String MOD_ID = "ahdecraft";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		FuelRegistry.INSTANCE.add(ModItems.RED_COAL, 3200);
		FuelRegistry.INSTANCE.add(ModBlocks.RED_COAL_BLOCK, 32000);

		ModWorldGeneration.generateWorldGen();
	}
}