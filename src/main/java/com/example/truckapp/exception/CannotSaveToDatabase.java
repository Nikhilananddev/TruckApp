package com.example.truckapp.exception;

public class CannotSaveToDatabase extends RuntimeException {

    private String message;

    public CannotSaveToDatabase(String message) {
        this.message = message;
    }

    public CannotSaveToDatabase() {
    }
}
