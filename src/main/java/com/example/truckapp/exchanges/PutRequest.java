package com.example.truckapp.exchanges;

import com.example.truckapp.dto.Load;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class PutRequest {
    private Load load;
}
