package cz.vsb.zelenak.controller;

import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cz.vsb.zelenak.City;
import cz.vsb.zelenak.connector.*;
import cz.vsb.zelenak.dto.WeatherDto;

@RestController
public class WeatherController {
	@RequestMapping("/weather")
	public String getWeather() {
		return "Počasí pro všechna města";
	}
	
	@RequestMapping("/weather/{city}")
	public WeatherDto getWeatherForCity(@PathVariable String city) {
		WeatherstackConnector weatherConnector = new WeatherstackConnector();
		City cityEnum = City.valueOf(city.toUpperCase());
		//String cty = getWeatherForCity(city).toString();
		return weatherConnector.getWeatherForCity(cityEnum);
	}
}
