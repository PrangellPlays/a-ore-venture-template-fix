package net.migstmc.oreventure.item;

import net.migstmc.oreventure.AOreVenture;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(AOreVenture.MOD_ID, name), item);
    }
    public static void registerModItems() {
        AOreVenture.LOGGER.info("Register Mod Items for" + AOreVenture.MOD_ID);
    }
}
