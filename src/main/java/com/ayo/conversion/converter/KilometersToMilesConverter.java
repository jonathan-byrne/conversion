package com.ayo.conversion.converter;

public class KilometersToMilesConverter implements Converter<Double>{
    @Override
    public Double convert(Double item) {
        return item * 0.62;
    }
}
