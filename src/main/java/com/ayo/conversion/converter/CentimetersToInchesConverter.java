package com.ayo.conversion.converter;

public class CentimetersToInchesConverter implements Converter<Double>{
    @Override
    public Double convert(Double centimetersLength) {
        Double inchesLength = centimetersLength * 0.39;
        return inchesLength;
    }
}
