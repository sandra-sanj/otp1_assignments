package temperature_converter;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest {
    private static TemperatureConverter temperatureConverter;

    @BeforeAll
    static void setup() {
        temperatureConverter = new TemperatureConverter();
    }

    @ParameterizedTest(name = "{0} Fahrenheit is {1} Celsius")
    @CsvSource({"40, 4.4", "0, -17.8", "32, 0.0", "-11, -23.9"})
    void fahrenheitToCelsius(double fahrenheit, double expectedCelsius) {
        assertEquals(expectedCelsius, temperatureConverter.fahrenheitToCelsius(fahrenheit));
    }

    @ParameterizedTest(name = "{0} Celsius is {1} Fahrenheit")
    @CsvSource({"0, 32.0", "32, 89.6", "40, 104.0", "62, 143.6", "100.1, 212.2", "-10, 14.0", "-15, 5.0"})
    void celsiusToFahrenheit(double celsius, double expectedFahrenheit) {
        assertEquals(expectedFahrenheit, temperatureConverter.celsiusToFahrenheit(celsius));
    }

    @ParameterizedTest(name = "{0} Celsius extreme = {1}")
    @CsvSource({"0, false", "20, false", "49.9, false", "-39.9, false", "50, true", "100, true", "-40, true"})
    void isExtremeTemperature(double celsius, boolean expected) {
        assertEquals(expected, temperatureConverter.isExtremeTemperature(celsius));
    }

    @ParameterizedTest(name = "{0} Kelvin is {1} Celsius")
    @CsvSource({ "273.15, 0.0", "273, -0.1", "200, -73.1", "250, -23.1", "0, -273.1", "111.1, -162.0" })
    void kelvinToCelsius(double kelvin, double celcius) {
        assertEquals(celcius, temperatureConverter.kelvinToCelsius(kelvin));
    }
}
