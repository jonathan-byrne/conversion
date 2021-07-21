package com.ayo.conversion.controller;

import com.ayo.conversion.converter.CentimetersToInchesConverter;
import com.ayo.conversion.converter.Converter;
import com.ayo.conversion.converter.InchesToCentimetersConverter;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConverterController {

    @PostMapping("/inchestocentimeters")
    Double convertInchesToCentimeters(@RequestParam Double inchesLength) {
        Converter<Double> converter = new InchesToCentimetersConverter();
        return converter.convert(inchesLength);
    }

    @PostMapping("centimetersToInches")
    Double convertCentimetersToInches(@RequestParam Double centimetersLength) {
        Converter<Double> converter = new CentimetersToInchesConverter();
        return converter.convert(centimetersLength);
    }
}
