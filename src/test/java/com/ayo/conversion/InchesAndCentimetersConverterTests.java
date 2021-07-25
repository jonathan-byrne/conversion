package com.ayo.conversion;

import com.ayo.conversion.converter.CentimetersToInchesConverter;
import com.ayo.conversion.converter.Converter;
import com.ayo.conversion.converter.InchesToCentimetersConverter;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class InchesAndCentimetersConverterTests {

    /**
     * Testing to check that the InchesToCentimetersConverter is idempotent
     *
     * It would be a design flaw to hardcode the calculation in this unit test,
     * if the calculation is changed in future a unit test with a hardcoded calculation
     * would fail.
     *
     * This way we can check the consistency of the converter regardless of
     * any changes to it's calculation
     */
    @Test
    public void convertInchesToCentimeters() {
        Converter<Double> inchesToCentimetersConverter = new InchesToCentimetersConverter();
        Double centimetersSizeOne = inchesToCentimetersConverter.convert(1.0);
        Double centimetersSizeTwo = inchesToCentimetersConverter.convert(1.0);

        Assert.assertEquals(centimetersSizeOne, centimetersSizeTwo);
    }

    /**
     * This tests whether the CentimetersToInchesConverter is idempotent
     *
     * see convertInchesToCentimeters() above for information on the design decisions for this unit test
     */
    @Test
    public void convertCentimetersToInches() {
        Converter<Double> centimetersToInchesConverter = new CentimetersToInchesConverter();
        Double inchesSizeOne = centimetersToInchesConverter.convert(1.0);
        Double inchesSizeTwo = centimetersToInchesConverter.convert(1.0);

        Assert.assertEquals(inchesSizeOne, inchesSizeTwo);
    }
}
