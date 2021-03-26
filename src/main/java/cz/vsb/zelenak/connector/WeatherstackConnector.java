package cz.vsb.zelenak.connector;

import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import cz.vsb.zelenak.dto.WeatherDto;
import cz.vsb.zelenak.dto.WeatherstackDto;

public class WeatherstackConnector {
	//http://api.weatherstack.com/current?access_key=d6e323b78c78ee658770738f22900675&query=New%20York
	
	private static String baseURL = "http://api.weatherstack.com/";
	private static String urlParam = "current?access_key=";
	private static String APIkey = "d6e323b78c78ee658770738f22900675";
	
	private static String url = baseURL + urlParam + APIkey + "&query=";
	
	public WeatherDto getWeatherForCity(Enum city) {
		RestTemplate template = new RestTemplate();
		URI uri = null;
		try {
			uri = new URI(url + city.toString());
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
		ResponseEntity<WeatherstackDto> response = template.getForEntity(uri, WeatherstackDto.class);
		WeatherDto weatherDto = new WeatherDto();
		weatherDto.setLocation(city.toString());
		weatherDto.setRel_humidity(response.getBody().getCurrent().getHumidity());
		weatherDto.setTemp_celsius(response.getBody().getCurrent().getTemperature());
		weatherDto.setTimestamp(response.getBody().getCurrent().getObservation_time());
		weatherDto.setWeatherDesctiption(response.getBody().getCurrent().getWeather_descriptions().toString());
		weatherDto.setWindDirection(response.getBody().getCurrent().getWind_dir());
		weatherDto.setWindSpeed_mps(response.getBody().getCurrent().getWind_speed());
		return weatherDto;
	}
}
