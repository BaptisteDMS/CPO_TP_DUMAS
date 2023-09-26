
/**
 *
 * @author baptiste
 */

import java.util.Scanner;

public class Calculs{
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Entrez le premier entier : ");
            int premierEntier = scanner.nextInt();
            System.out.print("Entrez le deuxième entier : ");
            int deuxiemeEntier = scanner.nextInt();
            System.out.println("Vous avez saisi les nombres : " + premierEntier + " et " + deuxiemeEntier);
            int somme = premierEntier + deuxiemeEntier;
            int difference = premierEntier - deuxiemeEntier;
            int produit = premierEntier * deuxiemeEntier;
            int quotient = premierEntier / deuxiemeEntier;
            int reste = premierEntier % deuxiemeEntier;
            System.out.println("La somme est : " + somme);
            System.out.println("La différence est : " + difference);
            System.out.println("Le produit est : " + produit);
            System.out.println("Le quotient est : " + quotient);
            System.out.println("Le reste est : " + reste);
        }
    }
}
