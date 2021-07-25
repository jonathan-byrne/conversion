package com.ayo.conversion.converter;

public class MetersToFeetConverter implements Converter<Double> {
    @Override
    public Double convert(Double item) {
        return item * 3.28;
    }
}
