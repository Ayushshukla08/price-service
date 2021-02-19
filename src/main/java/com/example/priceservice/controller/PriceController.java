package com.example.priceservice.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping(value = "/api/")
public class PriceController {

    /**
     * Return fuel price for a city. Adding 4 cities as examples at the moment as it is just a mock service.
     *
     * @param city name
     * @return fuel price
     */
    @GetMapping("fuel-price/{city}")
    public Double getPrice(@PathVariable String city) {
        log.info("inside call {}", city);

        if (city.equalsIgnoreCase("Bangalore"))
            return 70.0;
        else if (city.equalsIgnoreCase("Lucknow"))
            return 80.0;
        else if (city.equalsIgnoreCase("Mumbai"))
            return 75.0;
        else if (city.equalsIgnoreCase("Delhi"))
            return 100.0;
        else
            return 0.0;
    }
}
