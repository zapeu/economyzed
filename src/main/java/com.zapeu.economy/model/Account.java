package com.zapeu.economy.model;

import java.util.UUID;

public class Account {
    private final UUID owner;
    private long balance;
    private final AccountType type;

    public Account(UUID owner, AccountType type) {
        this.owner = owner;
        this.type = type;
        this.balance = 0;
    }

    public UUID getOwner() { return owner; }
    public long getBalance() { return balance; }
    public void setBalance(long balance) { this.balance = balance; }
    public AccountType getType() { return type; }
}

