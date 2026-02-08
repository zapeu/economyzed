package com.zapeu.economy;

import com.zapeu.economy.command.MoneyCommand;
import com.zapeu.economy.service.AccountService;
import com.zapeu.economy.storage.AccountRepository;
import com.zapeu.economy.storage.InMemoryAccountRepository;
import org.bukkit.plugin.java.JavaPlugin;

public final class EconomyCore extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("EconomyCore carregado");
        AccountRepository repo = new InMemoryAccountRepository();
        AccountService service = new AccountService(repo);

        getCommand("money").setExecutor(new MoneyCommand(service));

    }

    @Override
    public void onDisable() {
        getLogger().info("EconomyCore desligado");
    }
}
