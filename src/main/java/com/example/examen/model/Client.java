package com.example.examen.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;

    @OneToOne
    private PizzaMenu pizzaMenu;

    @OneToMany
    private Order order;

    @OneToMany
    private Pizza pizza;

    public Order getOrders() {
        return order;
    }
}
