package com.example.truckapp.exception;

public class LoadNotFoundException extends RuntimeException {

  private  String message;


    public LoadNotFoundException(String message) {
        this.message = message;
    }
}
