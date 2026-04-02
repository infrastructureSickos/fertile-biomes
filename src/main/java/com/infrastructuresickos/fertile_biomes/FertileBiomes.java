package com.infrastructuresickos.fertile_biomes;

import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("fertile_biomes")
public class FertileBiomes {
    public static final Logger LOGGER = LogManager.getLogger();

    public FertileBiomes() {
        LOGGER.info("FertileBiomes mod initialized");
    }
}
