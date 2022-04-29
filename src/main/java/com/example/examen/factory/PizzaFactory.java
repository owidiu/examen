package com.example.examen.factory;

import com.example.examen.model.Pizza;
import com.example.examen.model.pizzaType.Capricciosa;
import com.example.examen.model.pizzaType.Funghi;
import com.example.examen.model.pizzaType.Margherita;
import org.springframework.stereotype.Component;

@Component
public class PizzaFactory {
    public enum PizzaType{
        MARGHERITA,
        CAPRICIOSA,
        FUNGHI
    }

    public Pizza createPizza(PizzaType pizzaType){
        Pizza pizza = null;
        switch (pizzaType){
            case MARGHERITA:
                pizza = new Margherita();
                break;
            case CAPRICIOSA:
                pizza = new Capricciosa();
                break;

            case FUNGHI:
                pizza = new Funghi();
                break;
        }
        return pizza;
    }
}
