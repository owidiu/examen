package com.example.examen.controller;

import com.example.examen.errors.PizzaNotReadyError;
import com.example.examen.model.Pizza;
import com.example.examen.service.PizzaService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("order")
@AllArgsConstructor
public class PizzaController {
    private final PizzaService pizzaService;

    public Pizza createPizza(Pizza pizza) throws PizzaNotReadyError {
        return pizzaService.createPizza(pizza);
    }

    public Pizza updatePizza(Pizza pizza){
        return pizzaService.updatePizza(pizza);
    }

    public void deletePizza(Long id){
        pizzaService.deletePizza(id);
    }
}
