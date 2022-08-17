package com.example.truckapp.exchanges;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class Response {
    private String message;
    private String statusCode;
    private Date date;
}
