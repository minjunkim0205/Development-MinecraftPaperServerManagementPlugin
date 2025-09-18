package org.plugin;

import org.bukkit.plugin.java.JavaPlugin;

public final class CorePlugin extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("Start");
    }

    @Override
    public void onDisable() {
        getLogger().info("Stop");
    }
}