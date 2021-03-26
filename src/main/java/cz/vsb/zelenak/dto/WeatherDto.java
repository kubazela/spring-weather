package cz.vsb.zelenak.dto;

import java.util.Date;

public class WeatherDto {
	private String location;
	private String timestamp;
	private int temp_celsius;
	private int rel_humidity;
	private int windSpeed_mps;
	private String windDirection;
	private String weatherDesctiption;
	
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	public int getTemp_celsius() {
		return temp_celsius;
	}
	public void setTemp_celsius(int temp_celsius) {
		this.temp_celsius = temp_celsius;
	}
	public int getRel_humidity() {
		return rel_humidity;
	}
	public void setRel_humidity(int rel_humidity) {
		this.rel_humidity = rel_humidity;
	}
	public int getWindSpeed_mps() {
		return windSpeed_mps;
	}
	public void setWindSpeed_mps(int windSpeed_mps) {
		this.windSpeed_mps = windSpeed_mps;
	}
	public String getWindDirection() {
		return windDirection;
	}
	public void setWindDirection(String windDirection) {
		this.windDirection = windDirection;
	}
	public String getWeatherDesctiption() {
		return weatherDesctiption;
	}
	public void setWeatherDesctiption(String weatherDesctiption) {
		this.weatherDesctiption = weatherDesctiption;
	}
	
	
}
