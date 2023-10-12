/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_dumas;


/**
 *
 * @author bapti
 */
import java.util.Scanner;

public class TP2_convertisseurObjet_DUMAS {

    public static void main(String[] args) {
        Convertisseur convertisseur1 = new Convertisseur(); 

        Scanner scanner = new Scanner(System.in);
        int choix;

        do {
            System.out.println("Menu de conversion :");
            System.out.println("1. Convertir de Celsius en Fahrenheit");
            System.out.println("2. Convertir de Fahrenheit en Celsius");
            System.out.println("3. Convertir de Celsius en Kelvin");
            System.out.println("4. Convertir de Kelvin en Celsius");
            System.out.println("5. Convertir de Kelvin en Fahrenheit");
            System.out.println("6. Convertir de Fahrenheit en Kelvin");
            System.out.println("7. Quitter");
            System.out.print("Choix : ");
            choix = scanner.nextInt();

            switch (choix) {
                case 1 -> {
                    System.out.print("Entrez la température en Celsius : ");
                    double celsius = scanner.nextDouble();
                    double fahrenheit = convertisseur1.celsiusVersFahrenheit(celsius);
                    System.out.println("Résultat en Fahrenheit : " + fahrenheit);
                }
                case 2 -> {
                    System.out.print("Entrez la température en Fahrenheit : ");
                    double fahrenheit2 = scanner.nextDouble();
                    double celsius2 = convertisseur1.fahrenheitVersCelsius(fahrenheit2);
                    System.out.println("Résultat en Celsius : " + celsius2);
                }
                case 3 -> {
                    System.out.print("Entrez la température en Celsius : ");
                    double celsius3 = scanner.nextDouble();
                    double kelvin = convertisseur1.CelciusVersKelvin(celsius3);
                    System.out.println("Résultat en Kelvin : " + kelvin);
                }
                case 4 -> {
                    System.out.print("Entrez la température en Kelvin : ");
                    double kelvin2 = scanner.nextDouble();
                    double celsius4 = convertisseur1.KelvinVersCelcius(kelvin2);
                    System.out.println("Résultat en Celsius : " + celsius4);
                }
                case 5 -> {
                    System.out.print("Entrez la température en Kelvin : ");
                    double kelvin3 = scanner.nextDouble();
                    double fahrenheit3 = convertisseur1.KelvinVersFahrenheit(kelvin3);
                    System.out.println("Résultat en Fahrenheit : " + fahrenheit3);
                }
                case 6 -> {
                    System.out.print("Entrez la température en Fahrenheit : ");
                    double fahrenheit4 = scanner.nextDouble();
                    double kelvin4 = convertisseur1.FahrenheitVersKelvin(fahrenheit4);
                    System.out.println("Résultat en Kelvin : " + kelvin4);
                }
                case 7 -> {
                }
                default -> System.out.println("Choix invalide. Veuillez réessayer.");
            }
        } while (choix != 7);

        System.out.println("Convertisseur 1 : " + convertisseur1);
    }
}
