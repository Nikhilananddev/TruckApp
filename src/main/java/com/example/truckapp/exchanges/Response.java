package com.example.truckapp.exchanges;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
public class Response {
    private String message;
    private String statusCode;
    private Date date;
}
