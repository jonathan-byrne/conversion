package com.ayo.conversion;

import com.ayo.conversion.controller.ConverterController;
import com.ayo.conversion.converter.Converter;
import com.ayo.conversion.converter.InchesToCentimetersConverter;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

@RunWith(SpringRunner.class)
@WebMvcTest(ConverterController.class)
public class InchesAndCentimetersIntegrationTests {

    @Autowired
    MockMvc mvc;

    /**
     * In this test we are checking whether our service call returns the same
     * calculated result as our our internal converter class result
     *
     * We can check the integegrity of the calculation result returned by our
     * controller regardless of how the calculation implementation is changed
     *
     * @throws Exception
     */
    @Test
    public void inchesToCentimetersServiceCallTest() throws Exception {
        Double inchesLength = 1.0;
        Converter<Double> inchesToCentimetersConverter = new InchesToCentimetersConverter();

        MvcResult result = mvc.perform(post("/inchestocentimeters")
            .param("inchesLength", String.valueOf(inchesLength))
            .contentType(MediaType.APPLICATION_JSON)).andReturn();

        Double serviceCallCalculationResponse = Double.parseDouble(result.getResponse().getContentAsString());
        Double inchesToCentimetersConverterResult = inchesToCentimetersConverter.convert(inchesLength);

        Assert.assertEquals(serviceCallCalculationResponse, inchesToCentimetersConverterResult);
    }
}
