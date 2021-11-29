package com.c4g6.inventoryMS.exceptions;

public class NotEnoughStockException extends RuntimeException{
    public NotEnoughStockException(String message){
        super(message);
    }
}
