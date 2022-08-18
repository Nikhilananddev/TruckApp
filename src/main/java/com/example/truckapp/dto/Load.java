package com.example.truckapp.dto;

import com.example.truckapp.utils.ProductType;
import com.example.truckapp.utils.TruckType;
import com.fasterxml.jackson.annotation.JsonFormat;
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

    private Long id;

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
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date date;
}
