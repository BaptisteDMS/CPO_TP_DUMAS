/**
 *
 * @author baptiste
 */
public class Convertisseur {
    private int nbConversions;

    public Convertisseur() {
        nbConversions = 0;
    }

    // Méthode pour convertir de Celsius en Fahrenheit
    public float celsiusVersFahrenheit(float temperatureCelsius) {
        nbConversions++; // Incrémente le compteur de conversions
        return (temperatureCelsius * 9 / 5) + 32;
    }

    // Méthode pour convertir de Fahrenheit en Celsius

    public double fahrenheitVersCelsius(float temperatureFahrenheit) {
        nbConversions++; // Incrémente le compteur de conversions
        return (temperatureFahrenheit - 32) * 5 / 9;
    }
    
    public double CelciusVersKelvin(float temperatureCelcius) {
        nbConversions++;
        return (temperatureCelcius + 273.15);
    }
    
    public double KelvinVersCelcius(float temperatureKelvin) {
        nbConversion++;
        return (temperatureKlevin - 273,15);
    }

    public double 
        
    // Méthode pour afficher le nombre de conversions
    @Override
    public String toString() {
        return "Nombre de conversions effectuées : " + nbConversions;
    }
    
}
