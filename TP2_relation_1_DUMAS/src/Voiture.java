
/**
 *
 * @author bapti
 */
class Voiture {
    String modele;
    String marque;
    int nbPortes;
    Personne proprietaire;

    public Voiture(String modele, String marque, int nbPortes) {
        this.modele = modele;
        this.marque = marque;
        this.nbPortes = nbPortes;
        this.proprietaire = null; // Initialise le propriétaire à null
    }

    @Override
    public String toString() {
        return modele + " de marque " + marque;
    }
}
