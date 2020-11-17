package com.seaborne.soap_consumer;

import com.example.consumingwebservice.wsdl.GetOrderRequest;
import com.example.consumingwebservice.wsdl.GetOrderResponse;
import com.example.consumingwebservice.wsdl.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@SpringBootApplication
public class SoapConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SoapConsumerApplication.class, args);
	}

//	@Bean
//	CommandLineRunner lookup(OrderClient quoteClient) {
//		return args -> {
//			String userId = "102";
//
//			if (args.length > 0) {
//				userId = args[0];
//			}
//			GetOrderResponse response = quoteClient.getOrder(userId);
//			System.err.println(response.getOrder().getProduct());
//		};
//	}
}
