package com.ayo.conversion.converter;

public class FeetToMetersConverter implements Converter<Double>{
    @Override
    public Double convert(Double item) {
        return item * 0.30;
    }
}
