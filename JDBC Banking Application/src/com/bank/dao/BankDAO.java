package com.bank.dao;

import java.sql.*;
import com.bank.model.Account;
import com.bank.util.DBConnection;

public class BankDAO {

    public void createAccount(Account acc) throws Exception {
        Connection con = DBConnection.getConnection();
        String query = "INSERT INTO account VALUES (?, ?, ?, ?)";
        PreparedStatement ps = con.prepareStatement(query);

        ps.setInt(1, acc.getId());
        ps.setString(2, acc.getName());
        ps.setString(3, acc.getPassword());
        ps.setDouble(4, acc.getBalance());

        ps.executeUpdate();
        System.out.println("Account Created!");
    }
    
    public boolean accountExists(int id) throws Exception {
        Connection con = DBConnection.getConnection();
        String query = "SELECT id FROM account WHERE id=?";
        PreparedStatement ps = con.prepareStatement(query);

        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();

        return rs.next(); // true if exists
    }

    public Account login(int id, String password) throws Exception {
        Connection con = DBConnection.getConnection();
        String query = "SELECT * FROM account WHERE id=? AND password=?";
        PreparedStatement ps = con.prepareStatement(query);

        ps.setInt(1, id);
        ps.setString(2, password);

        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            Account acc = new Account();
            acc.setId(rs.getInt(1));
            acc.setName(rs.getString(2));
            acc.setPassword(rs.getString(3));
            acc.setBalance(rs.getDouble(4));
            return acc;
        }
        return null;
    }

    public void updateBalance(int id, double balance) throws Exception {
        Connection con = DBConnection.getConnection();
        String query = "UPDATE account SET balance=? WHERE id=?";
        PreparedStatement ps = con.prepareStatement(query);

        ps.setDouble(1, balance);
        ps.setInt(2, id);

        ps.executeUpdate();
    }

    public double getBalance(int id) throws Exception {
        Connection con = DBConnection.getConnection();
        String query = "SELECT balance FROM account WHERE id=?";
        PreparedStatement ps = con.prepareStatement(query);

        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();

        if (rs.next()) return rs.getDouble(1);
        return 0;
    }
}