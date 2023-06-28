package io.github.lucror1.infiniteanviluses;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ModEntry implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("infiniteanviluses");

    @Override
    public void onInitialize() {
        LOGGER.info("Infinite Anvil Uses has been initialized");
    }
}