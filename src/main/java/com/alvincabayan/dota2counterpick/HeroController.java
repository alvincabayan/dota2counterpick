package com.alvincabayan.dota2counterpick;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HeroController {
	@Autowired
	HeroService heroService;
	
	@GetMapping(value="/heroes", produces="application/json")
	public List<Hero> getAllHeroes() {
		return heroService.getAllHeroInformation();
//		return "Hello";
//		return restTemplate.exchange("https://api.steampowered.com/IEconDOTA2_570/GetHeroes/v0001/?key=8CD112488F157AC421D8E1DE72076185", 
//				HttpMethod.GET, httpEntity, String.class).getBody();
		
	}
	
}
