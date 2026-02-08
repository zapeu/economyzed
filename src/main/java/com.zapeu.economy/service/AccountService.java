package com.zapeu.economy.service;

import com.zapeu.economy.model.Account;
import com.zapeu.economy.model.AccountType;
import com.zapeu.economy.storage.AccountRepository;

import java.util.UUID;

public class AccountService {

    private final AccountRepository repository;

    public AccountService(AccountRepository repository) {
        this.repository = repository;
    }

    public Account getOrCreate(UUID playerId) {
        Account acc = repository.findByOwner(playerId);
        if (acc == null) {
            acc = new Account(playerId, AccountType.PLAYER);
            repository.save(acc);
        }
        return acc;
    }

    public long getBalance(UUID playerId) {
        return getOrCreate(playerId).getBalance();
    }
}

