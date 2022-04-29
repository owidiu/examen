package com.example.examen.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    private Client client;

    @ManyToOne
    private Pizza pizza;


    public void add(Order order) {
        this.client = order.getClient();
        this.pizza = order.getPizza();
    }
}
