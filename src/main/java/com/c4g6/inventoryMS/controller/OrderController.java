package com.c4g6.inventoryMS.controller;

import com.c4g6.inventoryMS.models.Order;
import com.c4g6.inventoryMS.models.OrderProduct;
import com.c4g6.inventoryMS.models.Stock;
import com.c4g6.inventoryMS.repositories.OrderRepository;
import com.c4g6.inventoryMS.repositories.StockRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
public class OrderController {
    private final OrderRepository orderRepository;
    private final StockRepository stockRepository;

    public OrderController(OrderRepository orderRepository, StockRepository stockRepository){
        this.orderRepository = orderRepository;
        this.stockRepository = stockRepository;
    }

    @PostMapping("/orders")
    Order newOrder(@RequestBody Order order){
        Date date = new Date();

        for(OrderProduct orderProduct:order.getOrderedProducts()){
            Stock stock = stockRepository.findStockByProduct(orderProduct.getProduct());
            stock.setQuantity(stock.getQuantity() - orderProduct.getQuantity());
            stock.setUpdateDate(date);
            stockRepository.save(stock);
        }

        order.setDate(date);
        return orderRepository.save(order);
    }

    @GetMapping("/orders/all")
    List<Order> getOrders(){
        return orderRepository.findAll();
    }

    @GetMapping("/orders/user/{username}")
    List<Order> getOrdersByName(@PathVariable String username){
        return orderRepository.findByUsername(username);
    }

    @GetMapping("/orders/id/{id}")
    Order getOrder(@PathVariable String id) {
        return orderRepository.findOrderById(id);
    }

    @PutMapping("/orders/update/{id}")
    Order updateOrder(@RequestBody Order upOrder, @PathVariable String id){
        Order order = orderRepository.findOrderById(id);
        order.setOrderedProducts(upOrder.getOrderedProducts());

        return orderRepository.save(order);
    }
}
