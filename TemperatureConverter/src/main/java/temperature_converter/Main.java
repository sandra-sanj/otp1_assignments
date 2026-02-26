package temperature_converter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature: ");
        double temperature = sc.nextDouble();

        System.out.print("Select temperature unit (c/f) and convert to the other: ");
        String unit = sc.next();*/

        double temperature = 100;
        String unit = "c";

        TemperatureConverter temperatureConverter = new TemperatureConverter();
        double convertedTemperature;
        String convertedTemperatureUnit;

        if (unit.equals("c")) {
            convertedTemperature = temperatureConverter.celsiusToFahrenheit(temperature);
            convertedTemperatureUnit = "F";
        } else {
            convertedTemperature = temperatureConverter.fahrenheitToCelsius(temperature);
            convertedTemperatureUnit = "C";
        }

        System.out.println(temperature + " " + unit.toUpperCase() + " equals " + convertedTemperature + " " + convertedTemperatureUnit);
    }
}
