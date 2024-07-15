package com.example.demo.services;

import com.example.demo.entities.GeocodingResponse;
import com.example.demo.entities.WeatherResponse;
import org.springframework.web.client.RestTemplate;
import com.example.demo.entities.GeocodingResponse.Location;

public class WeatherService {

    private RestTemplate restTemplate;

    private final String API_KEY = "f30b4a09860080b1fd2050774983619a";
    private final String BASE_URL = "http://api.openweathermap.org/data/2.5/weather";

    public WeatherResponse getWeather(String city, String units, String lang) {
        Location location = getCoordinates(city);

        return fetchWeather(city, units, lang);
    }


}
