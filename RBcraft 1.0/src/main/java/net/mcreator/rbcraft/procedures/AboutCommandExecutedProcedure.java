package net.mcreator.rbcraft.procedures;

import net.mcreator.rbcraft.RbcraftMod;

import java.util.Map;

public class AboutCommandExecutedProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		System.out.println("Hello!");
		RbcraftMod.LOGGER.info("Hello was triggered!");
	}
}
