package com.seaborne.soap_consumer;

import com.example.consumingwebservice.wsdl.GetOrderResponse;
import com.example.consumingwebservice.wsdl.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class OrderController {
    @Autowired
    private  OrderClient orderClient;

    @GetMapping("/api/soap_consumer/getOrder")
    Order oneOrder(){Order or = new Order(); or.setProduct("Yahoo"); return or;}

    @PostMapping("/api/soap_consumer/getOrder")
    GetOrderResponse getOrderResponse(@RequestBody Order request){
        return orderClient.getOrder(request.getUserId());
    }

}
