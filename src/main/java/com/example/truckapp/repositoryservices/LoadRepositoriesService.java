package com.example.truckapp.repositoryservices;

import com.example.truckapp.dto.Load;
import com.example.truckapp.utils.ProductType;
import com.example.truckapp.utils.TruckType;

import java.util.Date;
import java.util.List;

public interface LoadRepositoriesService {

    Load findLoadById(Long id);

    List<Load> findAllLoads();

    Load add(String loadingPoint,
             String unLoadingPoint,
             ProductType productType,
             TruckType truckType,
             int numberOfTruck,
             double weight,
             String comment,
             String shipperId,
             Date date);


    Load updateLoadById(Long id,
                        String loadingPoint,
                        String unLoadingPoint,
                        ProductType productType,
                        TruckType truckType,
                        int numberOfTruck,
                        double weight,
                        String comment,
                        String shipperId,
                        Date date);

    void deleteLoadById(Long id);

    List<Load> findLoadByShipperId(String id);
}

/*
* ***
*
*
*
*
*     @JsonIgnore
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
* */