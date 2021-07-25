package com.ayo.conversion.controller;

import com.ayo.conversion.converter.CelciusToFahrenheitConverter;
import com.ayo.conversion.converter.Converter;
import com.ayo.conversion.converter.FahrenheitToCelciusConverter;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CelciusFahrenheitController {

    @PostMapping("/celciustofahrenheit")
    Double convertCelciusToFahrenheit(@RequestParam Double degreesCelcius) {
        Converter<Double> converter = new CelciusToFahrenheitConverter();
        return converter.convert(degreesCelcius);
    }

    @PostMapping("/fahrenheittocelcius")
    Double convertFahrenheitToCelcius(@RequestParam Double degreesFahrenheit) {
        Converter<Double> converter = new FahrenheitToCelciusConverter();
        return converter.convert(degreesFahrenheit);
    }
}
