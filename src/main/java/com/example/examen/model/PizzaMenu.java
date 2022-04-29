package com.example.examen.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class PizzaMenu {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @OneToMany
    private Pizza pizza;

    @OneToOne
    private Client client;


    public void addPizza(Pizza pizza) {
        this.pizza = pizza;
    }
}
