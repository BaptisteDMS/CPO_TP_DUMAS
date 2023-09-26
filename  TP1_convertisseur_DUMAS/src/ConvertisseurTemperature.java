/**
 *
 * @author baptiste
 */

import java.util.Scanner;
public class ConvertisseurTemperature {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Saisissez une temperature : ");
            double tempCelsius = scanner.nextDouble();
            System.out.println("Saisissez la conversion que vous souhaitez effectuer :");
            System.out.println("1) De Celsius vers Kelvin");
            System.out.println("2) De Kelvin vers Celsius");
            System.out.println("3) De Fahrenheit vers Celsius");
            System.out.println("4) De Celsius vers Fahrenheit");
            System.out.println("5) De Kelvin vers Fahrenheit");
            System.out.println("6) De Fahrenheit vers Kelvin");
            int choix = scanner.nextInt();
            switch (choix) {
                case 1:
                    double kelvin = CelciusVersKelvin(tempCelsius);
                    System.out.println(tempCelsius + " degre Celsius est egal a " + kelvin + " degres Kelvin.");
                    break;
                case 2:
                    double celsius = KelvinVersCelcius(tempCelsius);
                    System.out.println(tempCelsius + " degre Kelvin est egal a " + celsius + " degres Celsius.");
                    break;
                case 3:
                    celsius = FahrenheitVersCelcius(tempCelsius);
                    System.out.println(tempCelsius + " degre Fahrenheit est egal à " + celsius + " degres Celsius.");
                    break;
                case 4:
                    double fahrenheit = CelsiusVersFahrenheit(tempCelsius);
                    System.out.println(tempCelsius + " degre Celsius est egal a " + fahrenheit + " degres Fahrenheit.");
                    break;
                case 5:
                    fahrenheit = KelvinVersFahrenheit(tempCelsius);
                    System.out.println(tempCelsius + " degre Kelvin est egal a " + fahrenheit + " degrs Fahrenheit.");
                    break;
                case 6:
                    kelvin = FahrenheitVersKelvin(tempCelsius);
                    System.out.println(tempCelsius + " degre Fahrenheit est egal a " + kelvin + " degres Kelvin.");
                    break;
                default:
                    System.out.println("Choix invalide.");
                    break;
            }
        }
    }
    public static double CelciusVersKelvin(double tCelsius) {
        return tCelsius + 273.15;
    }
    public static double KelvinVersCelcius(double tKelvin) {
        return tKelvin - 273.15;
    }
    public static double FahrenheitVersCelcius(double tFahrenheit) {
        return (tFahrenheit - 32) * 5/9;
    }
    public static double CelsiusVersFahrenheit(double tCelsius) {
        return (tCelsius * 9/5) + 32;
    }
    public static double KelvinVersFahrenheit(double tKelvin) {
        double celsius = KelvinVersCelcius(tKelvin);
        return CelsiusVersFahrenheit(celsius);
    }
    public static double FahrenheitVersKelvin(double tFahrenheit) {
        double celsius = FahrenheitVersCelcius(tFahrenheit);
        return CelciusVersKelvin(celsius);
    }
}
