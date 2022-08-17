package com.example.truckapp.exchanges;

import com.example.truckapp.dto.Load;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class GetAllLoadResponse {
    List<Load> loadList;
}
