package com.c4g6.inventoryMS.models;

import org.springframework.data.annotation.Id;

public class Category {
    @Id
    private String name;

    public Category(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}
