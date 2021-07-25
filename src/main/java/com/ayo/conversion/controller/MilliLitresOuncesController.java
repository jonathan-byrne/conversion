package com.ayo.conversion.controller;

import com.ayo.conversion.converter.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MilliLitresOuncesController {

    @PostMapping("/milliliterstounces")
    Double convertMillilitresToOunces(@RequestParam Double millilitres) {
        Converter<Double> converter = new MillilitresToOuncesConverter();
        return converter.convert(millilitres);
    }

    @PostMapping("/ouncestomillilitres")
    Double convertCentimetersToInches(@RequestParam Double ounces) {
        Converter<Double> converter = new OuncesToMillilitresConverter();
        return converter.convert(ounces);
    }
}
