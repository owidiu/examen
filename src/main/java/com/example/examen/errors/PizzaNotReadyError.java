package com.example.examen.errors;

public class PizzaNotReadyError extends Exception {
    public PizzaNotReadyError() {
        super("Pizza not ready");
    }
}
