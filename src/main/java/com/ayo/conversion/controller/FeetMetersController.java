package com.ayo.conversion.controller;

import com.ayo.conversion.converter.Converter;
import com.ayo.conversion.converter.FeetToMetersConverter;
import com.ayo.conversion.converter.MetersToFeetConverter;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeetMetersController {

    @PostMapping("/feettometers")
    Double convertFeetToMeters(@RequestParam Double feet) {
        Converter<Double> converter = new FeetToMetersConverter();
        return converter.convert(feet);
    }

    @PostMapping("/meterstofeet")
    Double convertMetersToFeet(@RequestParam Double meters) {
        Converter<Double> converter = new MetersToFeetConverter();
        return converter.convert(meters);
    }
}
