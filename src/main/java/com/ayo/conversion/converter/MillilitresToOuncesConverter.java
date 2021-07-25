package com.ayo.conversion.converter;

public class MillilitresToOuncesConverter implements Converter<Double>{
    @Override
    public Double convert(Double item) {
        return item * 0.035;
    }
}
