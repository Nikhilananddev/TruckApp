package com.example.truckapp.repositoryservices;

import com.example.truckapp.dto.Load;
import com.example.truckapp.model.LoadEntity;
import com.example.truckapp.repositories.LoadRepositories;
import com.example.truckapp.utils.ProductType;
import com.example.truckapp.utils.TruckType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class LoadRepositoriesServiceImpl implements LoadRepositoriesService {

    @Autowired
    LoadRepositories loadRepositories;

    @Override
    public List<Load> findLoadById(String id) {

        return null;
    }

    @Override
    public Load add(String loadingPoint, String unLoadingPoint, ProductType productType,
                    TruckType truckType,
                    int numberOfTruck,
                    double weight,
                    String comment, String shipperId,
                    Date date) {

        Load load;

        try{
            LoadEntity loadEntity =new LoadEntity();
            /**
             * loadingPoint,unLoadingPoint,
             *                     productType,truckType,
             *                     numberOfTruck,
             *                     weight,
             *                     comment,
             *                     shipperId,
             *                     date
             *
             * */
            loadEntity.setLoadingPoint(loadingPoint);
            loadEntity.setUnLoadingPoint(unLoadingPoint);
            loadEntity.setProductType(productType);
            loadEntity.setTruckType(truckType);
            loadEntity.setNumberOfTruck(numberOfTruck);
            loadEntity.setWeight(weight);
            loadEntity.setComment(comment);
            loadEntity.setDate(date);

        }catch (Exception e)

        {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public Load updateLoadById(String id, String loadingPoint, String unLoadingPoint, ProductType productType, TruckType truckType, int numberOfTruck, String comment, String shipperId, Date date) {
        return null;
    }

    @Override
    public void deleteLoadById(String id) {

    }
}
