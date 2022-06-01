package net.itzzyaboyterr.rekonstuktion.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.itzzyaboyterr.rekonstuktion.Rekonstuktion;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup REKONSTUKTION = FabricItemGroupBuilder.build(new Identifier(Rekonstuktion.MOD_ID, "rekonstuktion"),
            () -> new ItemStack(ModItems.ROCK_SHARD));
}
