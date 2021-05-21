package com.alvincabayan.dota2counterpick;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class HeroResponse {
	private HeroResult result;
}
