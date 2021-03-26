package cz.vsb.zelenak.connector;

import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class WeatherstackConnector {
	//http://api.weatherstack.com/current?access_key=d6e323b78c78ee658770738f22900675&query=New%20York
	
	private static String baseURL = "http://api.weatherstack.com/";
	private static String urlParam = "current?access_key=";
	private static String APIkey = "d6e323b78c78ee658770738f22900675";
	
	private static String url = baseURL + urlParam + APIkey + "&query=";
	
	public String getWeatherForCity(Enum city) {
		RestTemplate template = new RestTemplate();
		URI uri = null;
		try {
			uri = new URI(url + city.toString());
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
		ResponseEntity<String> response = template.getForEntity(uri, String.class);
		return response.getBody();
	}
}
