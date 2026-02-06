package com.zapeu.economy;

import org.bukkit.plugin.java.JavaPlugin;

public final class EconomyCore extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("EconomyCore carregado");
    }

    @Override
    public void onDisable() {
        getLogger().info("EconomyCore desligado");
    }
}
