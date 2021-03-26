package cz.vsb.zelenak.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cz.vsb.zelenak.City;
import cz.vsb.zelenak.connector.*;

@RestController
public class WeatherController {
	@RequestMapping("/weather")
	public String getWeather() {
		return "Počasí pro všechna města";
	}
	
	@RequestMapping("/weather/{city}")
	public String getWeatherForCity(@PathVariable String city) {
		WeatherstackConnector weatherConnector = new WeatherstackConnector();
		City cityEnum = City.valueOf(city.toUpperCase());
		return weatherConnector.getWeatherForCity(cityEnum);	
	}
}
