package com.example.examen.model.pizzaType;

import com.example.examen.model.Pizza;

import javax.persistence.Entity;

@Entity
public class Margherita extends Pizza {
    public static String bake() {
        return "Baking margherita";
    }
}
