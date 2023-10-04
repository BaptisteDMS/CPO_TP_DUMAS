
/**
 *
 * @author baptiste
 */

import java.util.Random;
import java.util.Scanner;

public class TP1_guessMyNumber_DUMAS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random generateurAleat = new Random();
        
        System.out.println("Choisissez le niveau de difficulte :");
        System.out.println("1. Facile (nombre d'essais illimit et messages d'aide)");
        System.out.println("2. Normal (nombre d'essais limite à 10 messages standards)");
        System.out.println("3. Difficile (nombre d'essais limite a 5, pas de messages )");

        int choixDifficulte = scanner.nextInt();
        int maxEssais;
        
        switch (choixDifficulte) {
            case 1 -> maxEssais = Integer.MAX_VALUE;
            case 2 -> maxEssais = 10;
            case 3 -> maxEssais = 5;
            default -> {
                System.out.println("Choix de difficulté invalide. Sélection du mode normal.");
                maxEssais = 10;
            }
        }

        int nombreAleatoire = generateurAleat.nextInt(101); // Génère un nombre aléatoire entre 0 et 100
        int tentatives = 0; // Compteur de tentatives

        try {
            while (tentatives < maxEssais) {
                System.out.print("Entrez un nombre entre 0 et 100 : ");
                int nombreSaisi = scanner.nextInt();
                tentatives++;

                if (nombreSaisi < nombreAleatoire) {
                    System.out.println("Trop petit !");
                    if (choixDifficulte == 1) {
                        System.out.println("Vraiment trop petit !");
                    }
                } else if (nombreSaisi > nombreAleatoire) {
                    System.out.println("Trop grand !");
                    if (choixDifficulte == 1) {
                        System.out.println("Vraiment trop grand !");
                    }
                } else {
                    System.out.println("Gagné !");
                    System.out.println("Nombre de tentatives : " + tentatives);
                    break;
                }
                
                // Mode cauchemar : 30% de probabilité d'indication incorrecte
                if (choixDifficulte == 4 && generateurAleat.nextInt(10) < 3) {
                    if (nombreSaisi < nombreAleatoire) {
                        System.out.println("Trop grand !");
                    } else {
                        System.out.println("Trop petit !");
                    }
                }
            }
            
            if (tentatives >= maxEssais) {
                System.out.println("Nombre d'essais epuises. Le nombre recherché etait : " + nombreAleatoire);
            }
        } finally {
            scanner.close();
        }
    }
}