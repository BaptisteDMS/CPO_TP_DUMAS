package bieres_dumas;

/**
 *
 * @author baptiste
 */
public class BouteilleBiere {
    private final String nom;
    private final float degreAlcool;
    private final String brasserie;
    private boolean ouverte;
    
    public BouteilleBiere(String unNom, float unDegre, String uneBrasserie) {
        nom = unNom;
        degreAlcool = unDegre;
        brasserie = uneBrasserie;
        ouverte = false; // Par défaut, la bouteille est fermée à la création
    }

    // Méthode pour lire l'étiquette de la bouteille
    public void lireEtiquette() {
        System.out.println("Bouteille de " + nom + " (" + degreAlcool + " degrés)\nBrasserie : " + brasserie);
    }

    // Méthode pour décapsuler la bouteille
    public boolean decapsuler() {
        if (!ouverte) {
            ouverte = true;
            return true; // La bouteille a été ouverte avec succès
        } else {
            System.out.println("Erreur : bière déjà ouverte");
            return false; // La bouteille était déjà ouverte
        }
    }

    // Méthode pour afficher l'état de la bouteille
    @Override
    public String toString() {
        String chaine_a_retourner;
        chaine_a_retourner = nom + " (" + degreAlcool + " degrés) Ouverte ? ";
        if (ouverte) {
            chaine_a_retourner += "oui";
        } else {
            chaine_a_retourner += "non";
        }
        return chaine_a_retourner;
    }

}
