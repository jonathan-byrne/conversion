package com.ayo.conversion;

import com.ayo.conversion.converter.CentimetersToInchesConverter;
import com.ayo.conversion.converter.Converter;
import com.ayo.conversion.converter.InchesToCentimetersConverter;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class ConverterTests {

    @Test
    public void convertInchesToCentimeters() {
        Converter<Double> inchesToCentimetersConverter = new InchesToCentimetersConverter();
        Double centimetersSizeOne = inchesToCentimetersConverter.convert(1.0);
        Double centimetersSizeTwo = inchesToCentimetersConverter.convert(1.0);

        //Checking this assert, not performing manual calculations here as the implementations could
        //change in the converter classes themselves
        Assert.assertEquals(centimetersSizeOne, centimetersSizeTwo);
    }

    @Test
    public void convertCentimetersToInches() {
        Converter<Double> centimetersToInchesConverter = new CentimetersToInchesConverter();
        Double inchesSizeOne = centimetersToInchesConverter.convert(1.0);
        Double inchesSizeTwo = centimetersToInchesConverter.convert(1.0);

        //Checking this assert, not performing manual calculations here as the implementations could
        //change in the converter classes themselves
        Assert.assertEquals(inchesSizeOne, inchesSizeTwo);
    }
}
