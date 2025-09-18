package org.plugin;

import org.bukkit.plugin.java.JavaPlugin;

public final class CorePlugin extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("플러그인 시작 테스트");
    }

    @Override
    public void onDisable() {
        getLogger().info("플러그인 종료 테스트");
    }
}