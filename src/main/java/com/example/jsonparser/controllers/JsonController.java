package com.example.jsonparser.controllers;

import java.io.File;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.jsonparser.beans.Bid;
import com.example.jsonparser.beans.BidResponse;
import com.example.jsonparser.business.JsonBusinessLogic;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class JsonController {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	JsonBusinessLogic logic ;
	
	@GetMapping("/welcome")
	public String welcome() {
		return "Hello Welcome to Json Parser project.";

	}

	@GetMapping("/readJson")
	public String readJson() {

		ObjectMapper objectMapper = new ObjectMapper();
		BidResponse br = null ;
		try {
			 br = objectMapper.readValue(new File("src/main/resources/bid-response.json"), BidResponse.class);

		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Bid highestBid = logic.getHighestBid(br);

		return highestBid.getId()+"="+highestBid.getPrice() + "\n"+ highestBid.getAdm();

	}

}
