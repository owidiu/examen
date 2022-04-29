package com.example.examen.controller;

import com.example.examen.model.PizzaMenu;
import com.example.examen.service.PizzaMenuService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@AllArgsConstructor
public class PizzaMenuController {
    private final PizzaMenuService pizzaMenuService;

    public void addPizza(PizzaMenu pizzaMenu, Long pizzaId) {
        pizzaMenuService.addPizza(pizzaMenu, pizzaId);
    }
}
