package com.example.truckapp.dto;

import com.example.truckapp.utils.ProductType;
import com.example.truckapp.utils.TruckType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Load {

    @JsonIgnore
    private  String id;

    @NotNull
    private String loadingPoint;

    @NotNull
    private String unLoadingPoint;

    @NotNull
    private ProductType productType;

    @NotNull
    private TruckType truckType;

    @NotNull
    private int numberOfTruck;

    @NotNull
    private double weight;

    private String comment;

    @NotNull
    private String shipperId;

    @NotNull
    private Date date;
}
