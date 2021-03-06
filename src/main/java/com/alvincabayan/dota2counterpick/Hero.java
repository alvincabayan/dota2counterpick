package com.alvincabayan.dota2counterpick;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Hero {
	private String name;
	private Long id;
}
