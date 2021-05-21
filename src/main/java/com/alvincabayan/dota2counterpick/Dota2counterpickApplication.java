package com.alvincabayan.dota2counterpick;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Dota2counterpickApplication {

	public static void main(String[] args) {
		SpringApplication.run(Dota2counterpickApplication.class, args);
	}
	
	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
	
	@Bean
	public HttpEntity getHttpEntity() {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity <String> entity = new HttpEntity<String>(headers);
		return entity;
	}
	
	
	
	
}
