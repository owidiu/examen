package com.example.examen.service;

import com.example.examen.errors.PizzaNotReadyError;
import com.example.examen.model.Pizza;
import com.example.examen.repository.PizzaRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PizzaService {
    @Autowired
    private PizzaRepository pizzaRepository;

    public Pizza createPizza(Pizza pizza) throws PizzaNotReadyError {
        return pizzaRepository.save(pizza);
    }

    public Pizza updatePizza(Pizza pizza){
        return pizzaRepository.save(pizza);
    }

    public void deletePizza(Long id){
        pizzaRepository.deleteById(id);
    }

}
