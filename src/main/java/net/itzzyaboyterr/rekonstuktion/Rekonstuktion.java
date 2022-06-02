package net.itzzyaboyterr.rekonstuktion;

import net.fabricmc.api.ModInitializer;
import net.itzzyaboyterr.rekonstuktion.block.ModBlocks;
import net.itzzyaboyterr.rekonstuktion.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Rekonstuktion implements ModInitializer {
	public static final String MOD_ID = "rekonstuktion";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

	}
}
