package com.ayo.conversion.converter;

public class OuncesToMillilitresConverter implements Converter<Double>{

    @Override
    public Double convert(Double item) {
        return item * 28.41;
    }
}
