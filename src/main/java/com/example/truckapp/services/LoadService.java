package com.example.truckapp.services;

import com.example.truckapp.exchanges.*;

public interface LoadService {


    public GetResponse getLoadById(String id);
    public GetAllLoadResponse getAllLoad();

    public Response addLoad(PostRequest postRequest);
    public Response updateLoadById(PutRequest putRequest);
    public Response deleteLoadById(String id);

}
