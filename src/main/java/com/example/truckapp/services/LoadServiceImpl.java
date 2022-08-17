package com.example.truckapp.services;

import com.example.truckapp.exchanges.GetResponse;
import com.example.truckapp.exchanges.PostRequest;
import com.example.truckapp.exchanges.PutRequest;
import com.example.truckapp.exchanges.Response;
import com.example.truckapp.repositoryservices.LoadRepositoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoadServiceImpl implements LoadService {

    @Autowired
    LoadRepositoriesService loadRepositoriesService;


    @Override
    public GetResponse getLoadById(String id) {
        return null;
    }

    @Override
    public Response addLoad(PostRequest postRequest) {


        try {
            loadRepositoriesService.add(
                    postRequest.getLoad().getLoadingPoint(),
                    postRequest.getLoad().getUnLoadingPoint(),
                    postRequest.getLoad().getProductType(),
                    postRequest.getLoad().getTruckType(),
                    postRequest.getLoad().getNumberOfTruck(),
                    postRequest.getLoad().getWeight(),
                    postRequest.getLoad().getComment(),
                    postRequest.getLoad().getShipperId(),
                    postRequest.getLoad().getDate());

        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
        return null;
    }

    @Override
    public Response updateLoadById(PutRequest putRequest) {
        return null;
    }

    @Override
    public Response deleteLoadById(String id) {
        return null;
    }
}
