package com.java.CurrencyExchangeClient.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
@Component
public class CunsomerService {

	 @KafkaListener(topics = "currencyTopic")
	    public void processMessage(String content){
	        System.out.println("Message received: " + content);
	    }
}
