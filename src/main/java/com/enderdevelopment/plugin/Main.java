package com.enderdevelopment.plugin;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("MagicBall has been enabled!");
        getCommand("magicball").setExecutor(new MagicBallCommand());
    }

    @Override
    public void onDisable() {
        getLogger().info("MagicBall has been disabled!");
    }
}