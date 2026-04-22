package com.bank.service;

import com.bank.dao.BankDAO;
import com.bank.exception.InsufficientBalanceException;

public class BankService {

    BankDAO dao = new BankDAO();

    public void deposit(int id, double amount) throws Exception {
        double balance = dao.getBalance(id);
        balance += amount;
        dao.updateBalance(id, balance);
        System.out.println("Deposited Successfully!");
    }

    public void withdraw(int id, double amount) throws Exception {
        double balance = dao.getBalance(id);

        if (balance < amount) {
            throw new InsufficientBalanceException("Not enough balance!");
        }

        balance -= amount;
        dao.updateBalance(id, balance);
        System.out.println("Withdraw Successful!");
    }

    public synchronized void transfer(int fromId, int toId, double amount) throws Exception {

        // 🔥 check receiver exists
        if (!dao.accountExists(toId)) {
            throw new Exception("Receiver account does not exist!");
        }

        // 🔥 check sender exists (extra safety)
        if (!dao.accountExists(fromId)) {
            throw new Exception("Sender account does not exist!");
        }

        double senderBalance = dao.getBalance(fromId);

        if (senderBalance < amount) {
            throw new InsufficientBalanceException("Transfer Failed! Insufficient Balance");
        }

        // debit
        dao.updateBalance(fromId, senderBalance - amount);

        // credit
        double receiverBalance = dao.getBalance(toId);
        dao.updateBalance(toId, receiverBalance + amount);

        System.out.println("Transfer Successful!");
    }
    // 🔥 NEW METHOD
    public void showBalance(int id) throws Exception {
        double balance = dao.getBalance(id);
        System.out.println("Current Balance: ₹ " + balance);
    }
}