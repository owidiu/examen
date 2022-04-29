package com.example.examen.errors;

public class NoIngredientsError extends Exception {
    public NoIngredientsError() {
        super("No ingredients found");
    }
}
