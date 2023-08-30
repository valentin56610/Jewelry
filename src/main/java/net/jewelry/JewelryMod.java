package net.jewelry;

import net.fabricmc.api.ModInitializer;
import net.jewelry.api.AttributeResolver;
import net.jewelry.internals.Group;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class JewelryMod implements ModInitializer {
    public static final String ID = "jewelry";

    /**
     * Runs the mod initializer.
     */
    @Override
    public void onInitialize() {
        AttributeResolver.setup();

        Registry.register(Registries.ITEM_GROUP, Group.KEY, Group.JEWELRY);
    }
}