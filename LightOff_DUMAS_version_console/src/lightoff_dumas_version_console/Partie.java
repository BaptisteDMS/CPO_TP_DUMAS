package lightoff_dumas_version_console;

import java.util.Scanner;


import java.util.Scanner;

public class Partie {
    private GrilleDeJeu grille;
    private int nbCoups;

    public Partie(int nbLignes, int nbColonnes) {
        grille = new GrilleDeJeu(nbLignes, nbColonnes);
        nbCoups = 0;
    }

    public void initialiserPartie() {
        grille.melangerMatriceAleatoirement(10); // Vous pouvez spécifier le nombre de tours de mélange
    }

    public void lancerPartie() {
        Scanner scanner = new Scanner(System.in);
        initialiserPartie();
        while (!grille.cellulesToutesEteintes()) {
            System.out.println(grille);
            System.out.print("Entrez une ligne, une colonne ou une diagonale pour inverser (ex. 1, A, diag sup, diag inf): ");
            String entree = scanner.nextLine().toLowerCase();

            if (entree.matches("\\d+")) {
                int ligne = Integer.parseInt(entree) - 1; // Pour convertir le numéro de ligne
                grille.activerLigneDeCellules(ligne);
            } else if (entree.matches("[a-z]")) {
                int colonne = entree.charAt(0) - 'a'; // Pour convertir la lettre de colonne
                grille.activerColonneDeCellules(colonne);
            } else if (entree.equals("diag sup")) {
                grille.activerDiagonaleMontante();
            } else if (entree.equals("diag inf")) {
                grille.activerDiagonaleDescendante();
            } else {
                System.out.println("Entrée non valide. Utilisez le format 1 pour la ligne, A pour la colonne, diag sup ou diag inf.");
            }

            nbCoups++;
        }

        System.out.println(grille);
        System.out.println("Félicitations ! Vous avez gagné en " + nbCoups + " coups.");
    }

    public static void main(String[] args) {
        Partie partie = new Partie(4, 4); // Remplacez les valeurs par la taille de grille souhaitée
        partie.lancerPartie();
    }
}


