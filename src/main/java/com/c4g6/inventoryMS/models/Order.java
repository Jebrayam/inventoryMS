package com.c4g6.inventoryMS.models;

import org.springframework.data.annotation.Id;

import java.util.Date;
import java.util.List;

public class Order {
    @Id
    private String id;
    private Date date;
    private List<OrderProduct> orderedProducts;
    private String username;

    public Order(String id, Date date, List<OrderProduct> orderedProducts, String username) {
        this.id = id;
        this.date = date;
        this.orderedProducts = orderedProducts;
        this.username = username;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<OrderProduct> getOrderedProducts() {
        return orderedProducts;
    }

    public void setOrderedProducts(List<OrderProduct> orderedProducts) {
        this.orderedProducts = orderedProducts;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
