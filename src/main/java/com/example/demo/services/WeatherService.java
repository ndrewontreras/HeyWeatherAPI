package com.example.demo.services;

import com.example.demo.entities.WeatherResponse;
import org.springframework.web.client.RestTemplate;

public class WeatherService {

    private RestTemplate restTemplate;

    private final String API_KEY = "f30b4a09860080b1fd2050774983619a";
    private final String BASE_URL = "http://api.openweathermap.org/data/2.5/weather";

    public WeatherResponse getWeather() {

        return null;
    }
}
