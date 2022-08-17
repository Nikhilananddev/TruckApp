package com.example.truckapp.services;

import com.example.truckapp.dto.Load;
import com.example.truckapp.exception.CannotSaveToDatabase;
import com.example.truckapp.exception.LoadNotFoundException;
import com.example.truckapp.exchanges.*;
import com.example.truckapp.repositoryservices.LoadRepositoriesService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.inject.Provider;
import java.util.Date;
import java.util.List;

@Service
public class LoadServiceImpl implements LoadService {

    @Autowired
    LoadRepositoriesService loadRepositoriesService;


    @Autowired
    Provider<ModelMapper> modelMapperProvider;


    @Override
    public GetResponse getLoadById(Long id) {

        try {
            GetResponse getResponse;
            Load load;
            load = loadRepositoriesService.findLoadById(id);
            getResponse = new GetResponse(load);
            return getResponse;
        } catch (Exception e) {
            e.printStackTrace();
            throw new LoadNotFoundException(e.getMessage());
        }

    }

    @Override
    public GetAllLoadResponse getAllLoad() {
        try {
            List<Load> loadList;
            loadList = loadRepositoriesService.findAllLoads();
            GetAllLoadResponse getAllLoadResponse = new GetAllLoadResponse(loadList);
            return getAllLoadResponse;
        } catch (Exception e) {
            e.printStackTrace();
            throw new LoadNotFoundException(e.getMessage());
        }
    }

    @Override
    public Response addLoad(PostRequest postRequest) {
        Load load;
        Response response;

        try {
            load = loadRepositoriesService.add(
                    postRequest.getLoadingPoint(),
                    postRequest.getUnLoadingPoint(),
                    postRequest.getProductType(),
                    postRequest.getTruckType(),
                    postRequest.getNumberOfTruck(),
                    postRequest.getWeight(),
                    postRequest.getComment(),
                    postRequest.getShipperId(),
                    postRequest.getDate());

            if (load != null) {
                response = new Response("added succesfull", "200", new Date());
                System.out.println("service" + response);
                return response;

            } else {
                throw new CannotSaveToDatabase("cannot save");
            }

        } catch (Exception exception) {
            throw new CannotSaveToDatabase(exception.getMessage());
        }
    }

    @Override
    public GetResponse updateLoadById(Long id, PutRequest putRequest) {
        try {
            GetResponse getResponse;
            Load load = loadRepositoriesService.updateLoadById(id,
                    putRequest.getLoadingPoint(),
                    putRequest.getUnLoadingPoint(),
                    putRequest.getProductType(),
                    putRequest.getTruckType(),
                    putRequest.getNumberOfTruck(),
                    putRequest.getWeight(),
                    putRequest.getComment(),
                    putRequest.getShipperId(),
                    putRequest.getDate());
            getResponse = new GetResponse(load);
            return getResponse;
        } catch (Exception e) {
            e.printStackTrace();
            throw new CannotSaveToDatabase(e.getMessage());
        }

    }

    @Override
    public Response deleteLoadById(Long id) {
        try {
            loadRepositoriesService.deleteLoadById(id);
            Response response = new Response("delete succesfull", "200", new Date());
            return response;
        } catch (Exception e) {
            e.printStackTrace();
            throw new CannotSaveToDatabase(e.getMessage());
        }
    }

    @Override
    public GetAllLoadResponse getLoadByShipperId(String id) {
        try {

            List<Load> loadList;
            loadList = loadRepositoriesService.findLoadByShipperId(id);
            GetAllLoadResponse getAllLoadResponse = new GetAllLoadResponse(loadList);
            return getAllLoadResponse;
        } catch (Exception e) {
            e.printStackTrace();
            throw new LoadNotFoundException(e.getMessage());
        }
    }
}
