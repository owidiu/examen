package com.example.examen.controller;

import com.example.examen.model.Order;
import com.example.examen.service.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
@RequestMapping("order")
@AllArgsConstructor
public class OrderController {
    private final OrderService orderService;

    public Order createOrder(Order order, Long clientId, Long pizzaId){
        return orderService.createOrder(order, clientId, pizzaId);
    }

    public Order updateOrder(Order order){
        return orderService.updateOrder(order);
    }

    public void deleteOrder(Long id){
        orderService.deleteOrder(id);
    }

    public Optional<Order> getOrderById(Long id){
        return orderService.getOrderById(id);
    }

    public Iterable<Order> getOrders(){
        return orderService.getOrders();
    }
}

