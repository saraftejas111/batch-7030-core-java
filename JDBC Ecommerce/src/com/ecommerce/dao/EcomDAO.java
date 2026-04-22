package com.ecommerce.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.ecommerce.model.Product;
import com.ecommerce.model.User;
import com.ecommerce.util.DBConnection;

public class EcomDAO {

    public User login(int id, String password) throws Exception {
        Connection con = DBConnection.getConnection();
        PreparedStatement ps = con.prepareStatement(
            "SELECT * FROM users WHERE id=? AND password=?");

        ps.setInt(1, id);
        ps.setString(2, password);

        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            User u = new User();
            u.setId(rs.getInt(1));
            u.setName(rs.getString(2));
            return u;
        }
        return null;
    }

    public List<Product> getAllProducts() throws Exception {
        Connection con = DBConnection.getConnection();
        List<Product> list = new ArrayList<>();

        ResultSet rs = con.createStatement()
            .executeQuery("SELECT * FROM products");

        while (rs.next()) {
            Product p = new Product();
            p.setId(rs.getInt(1));
            p.setName(rs.getString(2));
            p.setPrice(rs.getDouble(3));
            p.setStock(rs.getInt(4));
            list.add(p);
        }
        return list;
    }

    public Product getProduct(int id) throws Exception {
        Connection con = DBConnection.getConnection();
        PreparedStatement ps = con.prepareStatement(
            "SELECT * FROM products WHERE id=?");

        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            Product p = new Product();
            p.setId(rs.getInt(1));
            p.setName(rs.getString(2));
            p.setPrice(rs.getDouble(3));
            p.setStock(rs.getInt(4));
            return p;
        }
        return null;
    }

    public void updateStock(int id, int newStock) throws Exception {
        Connection con = DBConnection.getConnection();
        PreparedStatement ps = con.prepareStatement(
            "UPDATE products SET stock=? WHERE id=?");

        ps.setInt(1, newStock);
        ps.setInt(2, id);
        ps.executeUpdate();
    }

    public void createOrder(int userId, double total) throws Exception {
        Connection con = DBConnection.getConnection();
        PreparedStatement ps = con.prepareStatement(
            "INSERT INTO orders(user_id,total) VALUES (?,?)");

        ps.setInt(1, userId);
        ps.setDouble(2, total);
        ps.executeUpdate();
    }
}