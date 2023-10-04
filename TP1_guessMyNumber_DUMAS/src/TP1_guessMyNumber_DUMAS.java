
/**
 *
 * @author baptiste
 */

import java.util.Random;
import java.util.Scanner;

public class TP1_guessMyNumber_DUMAS {
    public static void main(String[] args) {
        //générateur de nombres aléatoires
        Random generateurAleat = new Random();
        
        // nombre aléatoire entre 0 et 100
        int nombreAleatoire = generateurAleat.nextInt(101); // Génère un nombre aléatoire entre 0 et 100
   
        try ( 
                Scanner scanner = new Scanner(System.in)) {
            // saisi d'un nombre
            while (true) {
                System.out.print("Entrez un nombre entre 0 et 100 : ");
                int nombreSaisi = scanner.nextInt();
                
                if (nombreSaisi < nombreAleatoire) {
                    System.out.println("Trop petit");
                } else if (nombreSaisi > nombreAleatoire) {
                    System.out.println("Trop grand");
                } else {
                    System.out.println("Gagne");
                    break; // Termine la boucle si gagné
                }
            }
        }
    }
}
    
