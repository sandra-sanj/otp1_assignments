package temperature_converter;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest {
    private static TemperatureConverter temperatureConverter;

    @BeforeAll
    static void setup() {
        temperatureConverter = new TemperatureConverter();
    }

    @Test
    void fahrenheitToCelsius_40() {
        double fahrenheit = 40;
        assertEquals(4.4, temperatureConverter.fahrenheitToCelsius(fahrenheit));
    }

    @Test
    void fahrenheitToCelsius_0() {
        double fahrenheit = 0;
        assertEquals(-17.8, temperatureConverter.fahrenheitToCelsius(fahrenheit));
    }

    @Test
    void fahrenheitToCelsius_32() {
        double fahrenheit = 32;
        assertEquals(0.0, temperatureConverter.fahrenheitToCelsius(fahrenheit));
    }

    @Test
    void fahrenheitToCelsius_Negative11() {
        double fahrenheit = -11;
        assertEquals(-23.9, temperatureConverter.fahrenheitToCelsius(fahrenheit));
    }

    @Test
    void celsiusToFahrenheit_0() {
        double celcius = 0;
        assertEquals(32.0, temperatureConverter.celsiusToFahrenheit(celcius));
    }

    @Test
    void celsiusToFahrenheit_32() {
        double celcius = 32;
        assertEquals(89.6, temperatureConverter.celsiusToFahrenheit(celcius));
    }

    @Test
    void celsiusToFahrenheit_40() {
        double celcius = 40;
        assertEquals(104.0, temperatureConverter.celsiusToFahrenheit(celcius));
    }

    @Test
    void celsiusToFahrenheit_62() {
        double celcius = 62;
        assertEquals(143.6, temperatureConverter.celsiusToFahrenheit(celcius));
    }

    @Test
    void celsiusToFahrenheit_100_1() {
        double celcius = 100.1;
        assertEquals(212.2, temperatureConverter.celsiusToFahrenheit(celcius));
    }

    @Test
    void celsiusToFahrenheit_Negative10() {
        double celcius = -10;
        assertEquals(14.0, temperatureConverter.celsiusToFahrenheit(celcius));
    }

    @Test
    void celsiusToFahrenheit_Negative15() {
        double celcius = -15;
        assertEquals(5.0, temperatureConverter.celsiusToFahrenheit(celcius));
    }

    @Test
    void isExtremeTemperature_False_0() {
        double celcius = 0;
        assertFalse(temperatureConverter.isExtremeTemperature(celcius));
    }

    @Test
    void isExtremeTemperature_False_20() {
        double celcius = 20;
        assertFalse(temperatureConverter.isExtremeTemperature(celcius));
    }

    @Test
    void isExtremeTemperature_True_100() {
        double celcius = 100;
        assertTrue(temperatureConverter.isExtremeTemperature(celcius));
    }

    @Test
    void isExtremeTemperature_True_50() {
        double celcius = 50;
        assertTrue(temperatureConverter.isExtremeTemperature(celcius));
    }

    @Test
    void isExtremeTemperature_False_49_9() {
        double celcius = 49.9;
        assertFalse(temperatureConverter.isExtremeTemperature(celcius));
    }

    @Test
    void isExtremeTemperature_True_Negative40() {
        double celcius = -40;
        assertTrue(temperatureConverter.isExtremeTemperature(celcius));
    }

    @Test
    void isExtremeTemperature_False_39_9() {
        double celcius = -39.9;
        assertFalse(temperatureConverter.isExtremeTemperature(celcius));
    }
}
