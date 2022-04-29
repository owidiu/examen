package com.example.examen.service;

import com.example.examen.model.Client;
import com.example.examen.model.Order;
import com.example.examen.repository.ClientRepository;
import com.example.examen.repository.OrderRepository;
import com.example.examen.repository.PizzaRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private PizzaRepository pizzaRepository;

    //add order
    public Order createOrder(Order order, Long clientId, Long pizzaId) {
            Optional<Client> clientOpt = clientRepository.findById(clientId);
        clientOpt.ifPresent(client -> client.getOrders().add(order));
        return order;
    }
    //get orders
    public Iterable<Order> getOrders(){
        return orderRepository.findAll();
    }
    //get order by id
    public Optional<Order> getOrderById(Long id){
        return orderRepository.findById(id);
    }
    //delete order
    public void deleteOrder(Long id){
        orderRepository.deleteById(id);
    }
    //update order
    public Order updateOrder(Order order){
        orderRepository.save(order);
        return order;
    }
}
