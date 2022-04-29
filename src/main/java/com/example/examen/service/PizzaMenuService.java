package com.example.examen.service;

import com.example.examen.model.PizzaMenu;
import com.example.examen.repository.PizzaMenuRepository;
import com.example.examen.repository.PizzaRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PizzaMenuService {
    @Autowired
    private PizzaMenuRepository pizzaMenuRepository;
    @Autowired
    private PizzaRepository pizzaRepository;

    public void save(PizzaMenu pizzaMenu) {
        pizzaMenuRepository.save(pizzaMenu);
    }


    public void delete(PizzaMenu pizzaMenu) {
        pizzaMenuRepository.delete(pizzaMenu);
    }

    public PizzaMenu findById(Long id) {
        return pizzaMenuRepository.findById(id).get();
    }

    public PizzaMenu createPizzaMenu(PizzaMenu pizzaMenu) {
        return pizzaMenuRepository.save(pizzaMenu);
    }

    //add pizza to pizzaMenu
    public void addPizza(PizzaMenu pizzaMenu, Long pizzaId) {
        pizzaMenu.addPizza(pizzaRepository.findById(pizzaId).get());
        pizzaMenuRepository.save(pizzaMenu);
    }

}
