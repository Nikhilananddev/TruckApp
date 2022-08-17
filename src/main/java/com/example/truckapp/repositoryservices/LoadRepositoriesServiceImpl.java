package com.example.truckapp.repositoryservices;

import com.example.truckapp.dto.Load;
import com.example.truckapp.exception.CannotSaveToDatabase;
import com.example.truckapp.exception.LoadNotFoundException;
import com.example.truckapp.model.LoadEntity;
import com.example.truckapp.repositories.LoadRepositories;
import com.example.truckapp.utils.ProductType;
import com.example.truckapp.utils.TruckType;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.inject.Provider;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class LoadRepositoriesServiceImpl implements LoadRepositoriesService {

    @Autowired
    LoadRepositories loadRepositories;

    @Autowired
    Provider<ModelMapper> modelMapperProvider;

    @Override
    public Load findLoadById(String id) {

        try {

            ModelMapper modelMapper = modelMapperProvider.get();
            Optional<LoadEntity> loadEntity;
            Load load;
            loadEntity = loadRepositories.findLoadById(Long.valueOf(id));
            load = modelMapper.map(loadEntity, Load.class);
            return load;
        } catch (Exception e) {
            throw new LoadNotFoundException(e.getMessage());
        }

    }

    @Override
    public List<Load> findAllLoads() {

        try{
            ModelMapper modelMapper=modelMapperProvider.get();
            List<Load> loadList = new ArrayList<>();

        List<LoadEntity> loadEntityList = loadRepositories.findAll();
            for (LoadEntity loadEntity:loadEntityList
                 ) {
           Load load =   modelMapper.map(loadEntity,Load.class);
              loadList.add(load);


            }
            return loadList;
    }
        catch (Exception e)
        {
            throw  new LoadNotFoundException(e.getMessage());
        }
    }

    @Override
    public Load add(String loadingPoint, String unLoadingPoint, ProductType productType,
                    TruckType truckType,
                    int numberOfTruck,
                    double weight,
                    String comment, String shipperId,
                    Date date) {

        ModelMapper modelMapper = modelMapperProvider.get();

        Load load;

        try {
            LoadEntity loadEntity = new LoadEntity();
            LoadEntity loadEntity2 = new LoadEntity();
            /**
             * loadingPoint
             * ,unLoadingPoint,
             *                     productType,
             *                     truckType,
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
            loadEntity.setShipperId(shipperId);
            loadEntity.setDate(date);

            loadEntity2 = loadRepositories.save(loadEntity);
            load = modelMapper.map(loadEntity2, Load.class);
            System.out.println("loadSaved" + load.getId());
            return load;

        } catch (Exception e) {
            throw new CannotSaveToDatabase(e.getMessage());
        }
    }

    @Override
    public Load updateLoadById(Long id, String loadingPoint, String unLoadingPoint, ProductType productType, TruckType truckType, int numberOfTruck, String comment, String shipperId, Date date) {
        return null;
    }

    @Override
    public void deleteLoadById(String id) {

    }
}
