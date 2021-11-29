package com.c4g6.inventoryMS.models;

import org.springframework.data.annotation.Id;

public class Category {
    @Id
    private String name;
    private  String description;

    public Category(String name, String description){
        this.name = name;
        this.description = description;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
