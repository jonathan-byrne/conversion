package com.ayo.conversion.controller;

import com.ayo.conversion.converter.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KilometersMilesController {

    @PostMapping("/kilometerstomiles")
    Double convertKilometersToMiles(@RequestParam Double kilometers) {
        Converter<Double> converter = new KilometersToMilesConverter();
        return converter.convert(kilometers);
    }

    @PostMapping("/milestokilometers")
    Double convertMilesToKilometers(@RequestParam Double miles) {
        Converter<Double> converter = new MilesToKilometersConverter();
        return converter.convert(miles);
    }
}
