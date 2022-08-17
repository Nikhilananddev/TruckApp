package com.example.truckapp.model;

import com.example.truckapp.utils.ProductType;
import com.example.truckapp.utils.TruckType;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "loads")
public class LoadEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

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

    @JsonFormat(pattern="dd/MM/yyyy")
    private Date date;
}
