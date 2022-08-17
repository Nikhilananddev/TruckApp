package com.example.truckapp.services;

import com.example.truckapp.exchanges.GetResponse;
import com.example.truckapp.exchanges.PostRequest;
import com.example.truckapp.exchanges.PutRequest;
import com.example.truckapp.exchanges.Response;

public interface LoadService {

    public GetResponse getLoadById(String id);

    public Response addLoad(PostRequest postRequest);
    public Response updateLoadById(PutRequest putRequest);
    public Response deleteLoadById(String id);

}
