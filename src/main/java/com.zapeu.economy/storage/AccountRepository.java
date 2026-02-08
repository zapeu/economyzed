package com.zapeu.economy.storage;

import com.zapeu.economy.model.Account;

import java.util.UUID;

public interface AccountRepository {
    Account findByOwner(UUID owner);
    void save(Account account);
}

