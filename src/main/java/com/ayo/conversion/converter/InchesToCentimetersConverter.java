package com.ayo.conversion.converter;

public class InchesToCentimetersConverter implements Converter<Double> {

    @Override
    public Double convert(Double item) {
        Double lengthInCentimeters;

        //Calculation to convert inches to centimeters
        lengthInCentimeters = item * 2.54;
        return lengthInCentimeters;
    }
}
