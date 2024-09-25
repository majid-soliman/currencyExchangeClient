package com.java.CurrencyExchangeClient.controller;

import java.util.Map;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/billsAPI")
@CrossOrigin("*")
public class BillController {
	
	 @MessageMapping("/sendMessage")
	    @SendTo("/topic/group")
	    public Map<String,Object> broadcastGroupMessage(Map<String,Object> reqMap) {
	        return reqMap;
	    }

}
