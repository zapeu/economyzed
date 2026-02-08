package com.zapeu.economy.command;

import com.zapeu.economy.service.AccountService;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class MoneyCommand implements CommandExecutor {

    private final AccountService service;

    public MoneyCommand(AccountService service) {
        this.service = service;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if (!(sender instanceof Player player)) {
            sender.sendMessage("Apenas jogadores.");
            return true;
        }

        long balance = service.getBalance(player.getUniqueId());
        player.sendMessage("Saldo: " + balance);

        return true;
    }
}

