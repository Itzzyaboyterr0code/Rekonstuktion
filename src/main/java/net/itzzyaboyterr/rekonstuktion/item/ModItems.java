package net.itzzyaboyterr.rekonstuktion.item;

import net.itzzyaboyterr.rekonstuktion.Rekonstuktion;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Rekonstuktion.MOD_ID, name), item);
    }
    
    public static void registerModItems() {
        Rekonstuktion.LOGGER.info("Registering Mod Items for " + Rekonstuktion.MOD_ID);
    }
}
