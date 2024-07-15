package com.example.demo.services;

import com.example.demo.entities.GeocodingResponse;
import com.example.demo.entities.WeatherResponse;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import com.example.demo.entities.GeocodingResponse.Location;

import java.util.List;

public class WeatherService {

    private RestTemplate restTemplate;

    private final String API_KEY = "f30b4a09860080b1fd2050774983619a";
    private final String WEATHER_URL = "http://api.openweathermap.org/data/2.5/weather";

    private final String GEOCODING_URL = "http://api.openweathermap.org/data/2.5/weather";

    public WeatherResponse getWeather(String city, String units, String lang) {
        Location location = getCoordinates(city);

        return null; //fetchWeather(city, units, lang);
    }

    private Location getCoordinates(String city) {
        String url = String.format("%s?q=%s&appid=%s", GEOCODING_URL, city, API_KEY);
        ResponseEntity<List<GeocodingResponse.GeocodingResult>> response = restTemplate.exchange(url, HttpMethod.GET, null,
                new ParameterizedTypeReference<List<GeocodingResponse.GeocodingResult>>() {});

        return null;
    }


}
