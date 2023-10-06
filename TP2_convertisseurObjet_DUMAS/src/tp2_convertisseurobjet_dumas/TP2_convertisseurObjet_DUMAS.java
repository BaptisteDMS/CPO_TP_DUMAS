/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_dumas;

import java.util.Scanner;

/**
 *
 * @author bapti
 */
public class TP2_convertisseurObjet_DUMAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Convertisseur convertisseur1 = new Convertisseur(); 
        Convertisseur convertisseur2 = new Convertisseur(); 

        Scanner scanner = new Scanner(System.in);
        int choix;

        do {
            System.out.println("Menu de conversion :");
            System.out.println("1. Convertir de Celsius en Fahrenheit");
            System.out.println("2. Convertir de Fahrenheit en Celsius");
            System.out.println("3. Quitter");
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
                }
                default -> System.out.println("Choix invalide. Veuillez réessayer.");
            }
                    } while (choix != 3);

        System.out.println("Convertisseur 1 : " + convertisseur1);
        System.out.println("Convertisseur 2 : " + convertisseur2);
    }
}