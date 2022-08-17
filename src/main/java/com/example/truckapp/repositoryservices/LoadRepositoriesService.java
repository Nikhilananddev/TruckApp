package com.example.truckapp.repositoryservices;

import com.example.truckapp.dto.Load;
import com.example.truckapp.utils.ProductType;
import com.example.truckapp.utils.TruckType;

import java.util.Date;
import java.util.List;

public interface LoadRepositoriesService {

    public List<Load> findLoadById(String id);

    public Load add(String loadingPoint,
                    String unLoadingPoint,
                    ProductType productType,
                    TruckType truckType,
                    int numberOfTruck,
                    double weight,
                    String comment,
                    String shipperId,
                    Date date);


    public Load updateLoadById(String id,
                               String loadingPoint,
                               String unLoadingPoint,
                               ProductType productType,
                               TruckType truckType,
                               int numberOfTruck,
                               String comment,
                               String shipperId,
                               Date date);

    public void deleteLoadById(String id);
}

/*
* ***
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