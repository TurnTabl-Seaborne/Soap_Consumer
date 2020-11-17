package com.seaborne.soap_consumer;

import com.example.consumingwebservice.wsdl.GetOrderRequest;
import com.example.consumingwebservice.wsdl.GetOrderResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

public class OrderClient extends WebServiceGatewaySupport {

    private static final Logger log = LoggerFactory.getLogger(OrderClient.class);

    public GetOrderResponse getOrder(String userId) {

        GetOrderRequest request = new GetOrderRequest();
        request.setUserId(userId);

        log.info("Requesting order for user id :  " + userId);

        GetOrderResponse response = (GetOrderResponse) getWebServiceTemplate()
                .marshalSendAndReceive("http://localhost:8080/ws", request);
        return response;
    }

}
