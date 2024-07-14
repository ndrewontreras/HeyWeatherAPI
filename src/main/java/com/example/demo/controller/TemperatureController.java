package com.example.demo.controller;

import com.example.demo.entities.WeatherResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class TemperatureController {

    @RequestMapping("/{city}/temperature")
    public ResponseEntity<WeatherResponse> getTemp(
            @PathVariable String city,
            @RequestParam (required = false, defaultValue = "metric") String units,
            @RequestParam (required = false, defaultValue = "en") String lang) {

        return null;
    }
}
