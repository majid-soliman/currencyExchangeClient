package com.java.CurrencyExchangeClient.service;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Component;
@Component
public class CunsomerService {
	
	 @Autowired
	 SimpMessagingTemplate template;

	 @KafkaListener(topics = "currencyTopic")
	    public void processMessage(String content){
//		 JSONObject json = new JSONObject(content);
	        System.out.println("Message received: " + content);
	        template.convertAndSend("/topic/group", content);
	    }
	 
	 
}
