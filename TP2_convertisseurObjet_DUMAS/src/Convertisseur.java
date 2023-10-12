/**
 *
 * @author baptiste
 */
public class Convertisseur {
    private int nbConversions;

    public Convertisseur() {
        nbConversions = 0;
    }

    public double celsiusVersFahrenheit(double temperatureCelsius) {
        nbConversions++;
        return (temperatureCelsius * 9 / 5) + 32;
    }

    public double fahrenheitVersCelsius(double temperatureFahrenheit) {
        nbConversions++;
        return (temperatureFahrenheit - 32) * 5 / 9;
    }

    public double CelciusVersKelvin(double temperatureCelsius) {
        nbConversions++;
        return (temperatureCelsius + 273.15);
    }

    public double KelvinVersCelcius(double temperatureKelvin) {
        nbConversions++;
        return (temperatureKelvin - 273.15);
    }

    public double KelvinVersFahrenheit(double temperatureKelvin) {
        nbConversions++;
        double celsius = KelvinVersCelcius(temperatureKelvin);
        return celsiusVersFahrenheit(celsius);
    }

    public double FahrenheitVersKelvin(double temperatureFahrenheit) {
        nbConversions++;
        double celsius = fahrenheitVersCelsius(temperatureFahrenheit);
        return CelciusVersKelvin(celsius);
    }

    @Override
    public String toString() {
        return "Nombre de conversions effectuées : " + nbConversions;
    }
}
