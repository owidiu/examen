package com.example.examen.errors;

public class NotEnoughMoneyError extends Exception {
    public NotEnoughMoneyError(String message) {
        super(message);
    }
}
