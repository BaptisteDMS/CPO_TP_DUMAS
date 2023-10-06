package tp2_bieres_dumas;

import bieres_dumas.BouteilleBiere;

/**
 *
 * @author baptiste
 */
public class TP2_Bieres_DUMAS {

 public static void main(String[] args) {
        // Création d'une première bouteille de bière
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls", 7.0f, "Dubuisson");

        // Affichage de l'étiquette
        uneBiere.lireEtiquette();

        // Décapsuler la première bouteille
        uneBiere.decapsuler();

        // Affichage de l'état de la première bouteille
        System.out.println(uneBiere);

        // Création d'une seconde bouteille de bière
        BouteilleBiere autreBiere = new BouteilleBiere("Leffe", 6.6f, "Abbaye de Leffe");

        // Affichage de l'étiquette
        autreBiere.lireEtiquette();

        // Décapsuler la seconde bouteille
        autreBiere.decapsuler();

        // Affichage de l'état de la seconde bouteille
        System.out.println(autreBiere);
    }
}