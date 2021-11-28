package com.c4g6.inventoryMS.models;

import org.springframework.data.annotation.Id;

import java.util.Date;

public class Order {
    @Id
    private Integer id;
    private Date date;

    public Order(int id, Date date) {
        this.id = id;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
