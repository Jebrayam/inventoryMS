package com.c4g6.inventoryMS.controller;

import com.c4g6.inventoryMS.models.Stock;
import com.c4g6.inventoryMS.repositories.StockRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
public class StockController {
    private final StockRepository stockRepository;

    public  StockController(StockRepository stockRepository){
        this.stockRepository = stockRepository;
    }

    @PostMapping("/stock")
    Stock newStock(@RequestBody Stock stock){
        stock.setUpdateDate(new Date());
        return stockRepository.save(stock);
    }

    @GetMapping("/stock/{product}")
    Stock getStock(@PathVariable String product){
        return stockRepository.findStockByProduct(product);
    }

    @GetMapping("/stock/all")
    List<Stock> getAllStock(){
        return stockRepository.findAll();
    }

    @PutMapping("/stock/update/{product}")
    Stock updateStock(@RequestBody Stock upStock, @PathVariable String product){
        Stock stock = stockRepository.findStockByProduct(product);
        stock.setUpdateDate(new Date());
        stock.setQuantity(upStock.getQuantity());
        return stockRepository.save(stock);
    }

}
