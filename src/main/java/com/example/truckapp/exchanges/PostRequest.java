package com.example.truckapp.exchanges;

import com.example.truckapp.dto.Load;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PostRequest {

    private Load load;
}
