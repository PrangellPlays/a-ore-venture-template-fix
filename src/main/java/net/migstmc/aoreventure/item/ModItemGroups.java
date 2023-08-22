package net.migstmc.aoreventure.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.migstmc.aoreventure.AOreVenture;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup NEW_ORES_GROUPS = Registry.register(Registries.ITEM_GROUP, new Identifier(AOreVenture.MOD_ID, "newores"), FabricItemGroup.builder().displayName(Text.translatable("ItemGroup.new_ores")).icon(() -> new ItemStack(ModItems.RUBY)).entries((displayContext, entries) -> {entries.add(ModItems.RUBY);}).build());
    public static void registerItemGroups() {
        AOreVenture.LOGGER.info("Registering Item Group for" + AOreVenture.MOD_ID);
    }
}
