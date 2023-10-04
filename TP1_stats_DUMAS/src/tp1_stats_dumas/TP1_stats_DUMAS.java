/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_stats_dumas;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author bapti
 */
public class TP1_stats_DUMAS {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] tableauFacesDe = new int[6]; // Crée un tableau de 6 entiers initialisés à 0

        System.out.print("Entrez un nombre entier m : ");
        int m = scanner.nextInt();

        Random generateurAleat = new Random();

        for (int i = 0; i < m; i++) {
            // Génère un nombre aléatoire entre 0 et 5 (inclus) pour simuler un lancer de dé
            int resultatLancer = generateurAleat.nextInt(6);

            // Incrémente la cellule correspondant au résultat du lancer
            tableauFacesDe[resultatLancer]++;
        }

        // Affiche les résultats sous forme de pourcentages
        System.out.println("Résultats sous forme de pourcentages :");
        for (int i = 0; i < 6; i++) {
            double pourcentage = (double) tableauFacesDe[i] / m * 100.0;
            System.out.println("Face " + (i + 1) + ": " + pourcentage + "%");
        }
    }
}