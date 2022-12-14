package com.example.truckapp.controller;

import com.example.truckapp.exchanges.*;
import com.example.truckapp.services.LoadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(LoadController.LOAD_API_ENDPOINT)
public class LoadController {

    public static final String LOAD_API_ENDPOINT = "truckApp/v1";

    @Autowired
    LoadService loadService;


    @GetMapping("/load")
    public ResponseEntity<GetAllLoadResponse> getAllLoad() {
        GetAllLoadResponse getAllLoadResponse;


        getAllLoadResponse = loadService.getAllLoad();

        if (getAllLoadResponse != null) {
            return ResponseEntity.ok().body(getAllLoadResponse);
        }


        return ResponseEntity.badRequest().body(null);
    }

    @GetMapping("/load/{id}")
    public ResponseEntity<GetResponse> getLoadById(@PathVariable("id") Long id) {
        GetResponse getResponse;
        if (id != null) {
            getResponse = loadService.getLoadById(id);
            return ResponseEntity.ok().body(getResponse);
        }


        return ResponseEntity.badRequest().body(null);
    }

    @GetMapping("/loads")
    public ResponseEntity<GetAllLoadResponse> getLoadByShipperId(String id) {
        GetAllLoadResponse getResponse;
        if (id != null) {
            getResponse = loadService.getLoadByShipperId(id);
            return ResponseEntity.ok().body(getResponse);
        }


        return ResponseEntity.badRequest().body(null);
    }

    @GetMapping("/hello")
    public ResponseEntity<String> geHello(String id) {

        return ResponseEntity.badRequest().body("hello");
    }

    @PostMapping("/load")
    public ResponseEntity<Response> addLoad(@RequestBody PostRequest postRequest) {

        Response response;

        if (validRequest(postRequest)) {


            response = loadService.addLoad(postRequest);

            System.out.println(response.getMessage());

            return ResponseEntity.ok().body(response);
        }


        return ResponseEntity.badRequest().body(null);
    }

    @PutMapping("load/{id}")
    public ResponseEntity<GetResponse> updateLoad(@PathVariable("id") Long id, @RequestBody PutRequest putRequest) {

        if (putRequest != null) {
            GetResponse getResponse = loadService.updateLoadById(id, putRequest);
            return ResponseEntity.ok().body(getResponse);
        }

        return ResponseEntity.badRequest().body(null);
    }


    @DeleteMapping("load/{id}")
    public ResponseEntity<Response> deleteLoad(@PathVariable("id") Long id) {

        if (id != null) {
            Response response = loadService.deleteLoadById(id);
            return ResponseEntity.ok().body(response);
        }

        return ResponseEntity.badRequest().body(null);
    }

    public boolean validRequest(PostRequest postRequest) {


        return postRequest.getLoadingPoint() != null && postRequest.getUnLoadingPoint() != null
                && postRequest.getProductType() != null && postRequest.getTruckType() != null
                && postRequest.getNumberOfTruck() > 0 && postRequest.getWeight() > 0
                && postRequest.getShipperId() != null && postRequest.getDate() != null;
    }
}



