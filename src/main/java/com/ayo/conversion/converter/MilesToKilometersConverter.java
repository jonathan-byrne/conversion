package com.ayo.conversion.converter;

public class MilesToKilometersConverter implements Converter<Double>{
    @Override
    public Double convert(Double item) {
        return item * 1.609344;
    }
}
