package com.example.truckapp.services;

import com.example.truckapp.exchanges.*;

public interface LoadService {


    GetResponse getLoadById(Long id);

    GetAllLoadResponse getAllLoad();

    Response addLoad(PostRequest postRequest);

    GetResponse updateLoadById(Long id, PutRequest putRequest);

    Response deleteLoadById(Long id);

    GetAllLoadResponse getLoadByShipperId(String id);
}
