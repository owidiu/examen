package com.example.examen.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Pizza {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;
    private String description;

    @ManyToOne
    private Client client;

    @ManyToOne
    private Order order;

    @ManyToOne
    private PizzaMenu pizzaMenu;


}
