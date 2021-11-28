package com.c4g6.inventoryMS.models;

import org.springframework.data.annotation.Id;

import java.util.Date;

public class Stock {
    @Id
    private Product product;
    private Date updateDate;
    private int quantity;

    public Stock(Product product, Date updateDate, int quantity) {
        this.product = product;
        this.updateDate = updateDate;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
