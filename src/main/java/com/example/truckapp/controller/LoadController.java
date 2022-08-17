package com.example.truckapp.controller;

import com.example.truckapp.exchanges.GetResponse;
import com.example.truckapp.exchanges.PostRequest;
import com.example.truckapp.exchanges.PutRequest;
import com.example.truckapp.exchanges.Response;
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
    public ResponseEntity<GetResponse> getLoad(String id) {

        return ResponseEntity.badRequest().body(null);
    }

    @PostMapping("/load")
    public ResponseEntity<Response> addLoad(PostRequest postRequest) {

        Response response;

        if (validRequest(postRequest)) {


            response = loadService.addLoad(postRequest);

            return ResponseEntity.ok().body(response);
        }

        return ResponseEntity.badRequest().body(null);
    }

    @PutMapping("load/{id}")
    public ResponseEntity<Response> updateLoad(@PathVariable("id") String id, PutRequest putRequest) {


        return ResponseEntity.badRequest().body(null);
    }

    @DeleteMapping()
    public ResponseEntity<Response> deleteLoad(String id) {

        return ResponseEntity.badRequest().body(null);
    }

    public boolean validRequest(PostRequest postRequest) {

        if (postRequest.getLoad().getLoadingPoint() != null && postRequest.getLoad().getUnLoadingPoint() != null
                && postRequest.getLoad().getProductType() != null && postRequest.getLoad().getTruckType() != null
                && postRequest.getLoad().getNumberOfTruck() > 0 && postRequest.getLoad().getWeight() > 0
                && postRequest.getLoad().getShipperId() != null && postRequest.getLoad().getDate() != null
        ) {
            return true;

        }
        return false
    }
}


}
