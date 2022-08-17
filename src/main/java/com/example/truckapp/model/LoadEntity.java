package com.example.truckapp.model;

import com.example.truckapp.utils.ProductType;
import com.example.truckapp.utils.TruckType;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
@NoArgsConstructor
@Entity
@Table(name = "loads")
public class LoadEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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
