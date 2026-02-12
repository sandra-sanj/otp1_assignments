package temperature_converter;

public class TemperatureConverter {

    public double fahrenheitToCelsius(double fahrenheit) {
        double celcius = (fahrenheit - 32) * 5 / 9;
        return Math.round(celcius * 10.0) / 10.0;
    }

    public double celsiusToFahrenheit(double celcius) {
        double fahrenheit = (celcius * 9 / 5) + 32;
        return Math.round(fahrenheit * 10.0) / 10.0;
    }

    boolean isExtremeTemperature(double celcius) {
        if (-40 >= celcius || celcius >= 50) {
            return true;
        }
        return false;
    }
}
