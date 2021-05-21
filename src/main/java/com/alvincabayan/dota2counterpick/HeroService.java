package com.alvincabayan.dota2counterpick;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HeroService {
	@Autowired
	RestTemplate restTemplate;
	
	@Autowired
	HttpEntity httpEntity;
	
	//"https://api.steampowered.com/IEconDOTA2_570/GetHeroes/v0001/?key=8CD112488F157AC421D8E1DE72076185",
	public List<Hero> getAllHeroInformation() {
		ResponseEntity<HeroResponse> response = restTemplate.exchange(
				"https://api.steampowered.com/IEconDOTA2_570/GetHeroes/v0001/?key=8CD112488F157AC421D8E1DE72076185",
				HttpMethod.GET,
				httpEntity,
				new ParameterizedTypeReference<HeroResponse>() {});
		
		HeroResult hr = response.getBody().getResult();
		List<Hero> heroes = hr.getHeroes();
		return heroes;
	}
}
