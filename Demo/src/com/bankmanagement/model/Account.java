package com.bankmanagement.model;

/**
 * Account entity for BankingManagement project.
 * Encapsulation, validation and thread-safe balance operations.
 */
public class Account {
    private final int id;
    private String holderName;
    private AccountType type;
    private double balance;

    public enum AccountType { SAVINGS, CURRENT }

    public Account(int id, String holderName, AccountType type, double openingBalance) {
        if (id <= 0) throw new IllegalArgumentException("id must be > 0");
        if (holderName == null || holderName.trim().isEmpty()) throw new IllegalArgumentException("holderName required");
        if (!holderName.trim().matches("^[A-Za-z ]+$")) throw new IllegalArgumentException("holderName must contain only letters and spaces");
        if (type == null) throw new IllegalArgumentException("account type required");
        if (openingBalance < 0) throw new IllegalArgumentException("opening balance cannot be negative");

        this.id = id;
        this.holderName = holderName.trim();
        this.type = type;
        this.balance = openingBalance;
    }

    public int getId() { return id; }
    public String getHolderName() { return holderName; }
    public AccountType getType() { return type; }
    public double getBalance() { return balance; }

    public void setHolderName(String holderName) {
        if (holderName == null || holderName.trim().isEmpty()) throw new IllegalArgumentException("holderName required");
        if (!holderName.trim().matches("^[A-Za-z ]+$")) throw new IllegalArgumentException("holderName must contain only letters and spaces");
        this.holderName = holderName.trim();
    }

    public void setType(AccountType type) {
        if (type == null) throw new IllegalArgumentException("account type required");
        this.type = type;
    }

    public synchronized void deposit(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("deposit must be > 0");
        balance += amount;
    }

    public synchronized void withdraw(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("withdraw must be > 0");
        if (amount > balance) throw new IllegalArgumentException("insufficient funds");
        balance -= amount;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", holderName='" + holderName + '\'' +
                ", type=" + type +
                ", balance=" + balance +
                '}';
    }
}
