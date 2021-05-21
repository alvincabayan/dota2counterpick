package com.alvincabayan.dota2counterpick;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class HeroController {
	@Autowired
	RestTemplate restTemplate;
	
	@Autowired
	HttpEntity httpEntity;
	
	@GetMapping("/heroes")
	public String getAllHeroes() {
		return restTemplate.exchange("https://api.steampowered.com/IEconDOTA2_570/GetHeroes/v0001/?key=8CD112488F157AC421D8E1DE72076185", 
				HttpMethod.GET, httpEntity, String.class).getBody();
	}
}
