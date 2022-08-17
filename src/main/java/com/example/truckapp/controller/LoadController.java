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


          getAllLoadResponse=  loadService.getAllLoad();

          if (getAllLoadResponse!=null)
          {
              return ResponseEntity.ok().body(getAllLoadResponse);
          }




        return ResponseEntity.badRequest().body(null);
    }
    @GetMapping("/load/{id}")
    public ResponseEntity<GetResponse> getLoadById( @PathVariable("id") String id) {
        GetResponse getResponse;
        if (id!=null)
        {
            getResponse=  loadService.getLoadById(id);
            return ResponseEntity.ok().body(getResponse);
        }


        return ResponseEntity.badRequest().body(null);
    }

    @GetMapping("/hello")
    public ResponseEntity<String> geHello(String id) {

        return ResponseEntity.badRequest().body("hello");
    }
    @PostMapping("/load")
    public ResponseEntity<Response> addLoad( @RequestBody PostRequest postRequest) {

        Response response;

        if (validRequest(postRequest)) {


            response = loadService.addLoad(postRequest);

            System.out.println(response.getMessage());

            return ResponseEntity.ok().body(response);
        }
//        if (postRequest!=null){
//           response=  loadService.addLoad(postRequest);
////             response=new Response("added","200",new Date());
//            System.out.println("ControllerResponse    "+response);
//            return ResponseEntity.ok().body(response);
//        }
//        System.out.println(postRequest.getDate());

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


        if (postRequest.getLoadingPoint() != null && postRequest.getUnLoadingPoint() != null
                && postRequest.getProductType() != null && postRequest.getTruckType()!= null
                && postRequest.getNumberOfTruck() > 0 && postRequest.getWeight() > 0
                && postRequest.getShipperId() != null && postRequest.getDate() != null
        ) {
            return true;

        }
        return false;
    }
}



