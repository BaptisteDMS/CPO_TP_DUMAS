package bieres_dumas;

/**
 *
 * @author bapti
 */
public class BouteilleBiere {
    private final String nom;
    private final double degreAlcool;
    private final String brasserie;
    private boolean ouverte;

    public BouteilleBiere(String unNom, double unDegre, String uneBrasserie) {
        nom = unNom;
        degreAlcool = unDegre;
        brasserie = uneBrasserie;
        ouverte = false;
    }

    public void lireEtiquette() {
        System.out.println("Bouteille de " + nom + " (" + degreAlcool + " degrés)\nBrasserie : " + brasserie);
    }

    public boolean Decapsuler() {
        if (!ouverte) {
            ouverte = true;
            return true;
        } else {
            System.out.println("Erreur : bière déjà ouverte");
            return false;
        }
    }
}