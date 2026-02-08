package com.zapeu.economy.storage;

import com.zapeu.economy.model.Account;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class InMemoryAccountRepository implements AccountRepository {
    private final Map<UUID, Account> accounts = new HashMap<>();

    @Override
    public Account findByOwner(UUID owner) {
        return accounts.get(owner);
    }

    @Override
    public void save(Account account) {
        accounts.put(account.getOwner(), account);
    }
}

