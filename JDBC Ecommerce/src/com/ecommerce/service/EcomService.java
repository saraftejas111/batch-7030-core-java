package com.ecommerce.service;

import java.util.*;

import com.ecommerce.dao.EcomDAO;
import com.ecommerce.exception.OutOfStockException;
import com.ecommerce.model.*;

public class EcomService {

    EcomDAO dao = new EcomDAO();

    // 🛒 Cart (per session)
    Map<Integer, Integer> cart = new HashMap<>();

    public User login(int id, String pass) throws Exception {
        return dao.login(id, pass);
    }

    public void showProducts() throws Exception {
        List<Product> list = dao.getAllProducts();

        for (Product p : list) {
            System.out.println(p.getId() + " | " + p.getName() +
                    " | ₹" + p.getPrice() + " | Stock: " + p.getStock());
        }
    }

    public void addToCart(int productId, int qty) throws Exception {

        Product p = dao.getProduct(productId);

        if (p == null)
            throw new Exception("Product not found!");

        if (p.getStock() < qty)
            throw new OutOfStockException("Not enough stock!");

        cart.put(productId, cart.getOrDefault(productId, 0) + qty);

        System.out.println("Added to cart!");
    }

    public void viewCart() throws Exception {
        if (cart.isEmpty()) {
            System.out.println("Cart is empty!");
            return;
        }

        for (Map.Entry<Integer, Integer> e : cart.entrySet()) {
            Product p = dao.getProduct(e.getKey());
            System.out.println(p.getName() + " x " + e.getValue());
        }
    }

    public synchronized void checkout(int userId) throws Exception {

        if (cart.isEmpty()) {
            System.out.println("Cart empty!");
            return;
        }

        double total = 0;

        // 🔥 VALIDATE FIRST
        for (Map.Entry<Integer, Integer> e : cart.entrySet()) {
            Product p = dao.getProduct(e.getKey());

            if (p.getStock() < e.getValue())
                throw new OutOfStockException(p.getName() + " out of stock!");

        }

        // 🔥 APPLY CHANGES
        for (Map.Entry<Integer, Integer> e : cart.entrySet()) {
            Product p = dao.getProduct(e.getKey());

            dao.updateStock(p.getId(), p.getStock() - e.getValue());
            total += p.getPrice() * e.getValue();
        }

        dao.createOrder(userId, total);

        cart.clear();

        System.out.println("Order placed! Total: ₹" + total);
    }
}