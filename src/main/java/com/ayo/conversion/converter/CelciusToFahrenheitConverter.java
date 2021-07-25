package com.ayo.conversion.converter;

public class CelciusToFahrenheitConverter implements Converter<Double>{
    @Override
    public Double convert(Double item) {
        return (item * 1.8) + 32;
    }
}
