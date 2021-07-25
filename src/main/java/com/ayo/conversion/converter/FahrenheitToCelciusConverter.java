package com.ayo.conversion.converter;

public class FahrenheitToCelciusConverter implements Converter<Double>{
    @Override
    public Double convert(Double item) {
        return (item - 32) / 1.8;
    }
}
