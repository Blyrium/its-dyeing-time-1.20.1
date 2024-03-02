package net.blyrium.itsdyeingtime;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ItsDyeingTime implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("itsdyeingtime");

	@Override
	public void onInitialize() {
		LOGGER.info("It's Dyeing Time has been initialized");
	}
}