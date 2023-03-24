package com.dl.structure.num;

import com.dl.tags.Number;

import java.math.BigDecimal;

@Number(2469)
public class ConvertTemperature {
    public double[] convertTemperature(double celsius) {
        BigDecimal celsiusBD = new BigDecimal(Double.toString(celsius));
        double kelvin = celsiusBD.add(new BigDecimal("273.15")).doubleValue();
        double fahrenheit = celsiusBD.multiply(new BigDecimal("1.80")).add(new BigDecimal("32.00")).doubleValue();
        return new double[]{kelvin, fahrenheit};
    }
}
