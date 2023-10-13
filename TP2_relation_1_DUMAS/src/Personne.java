
/**
 *
 * @author bapti
 */

class Personne {
    String prenom;
    String nom;
    int nbVoitures;
    Voiture[] liste_voitures;

    public Personne(String prenom, String nom) {
        this.prenom = prenom;
        this.nom = nom;
        this.nbVoitures = 0;
        this.liste_voitures = new Voiture[3]; // Initialise le tableau de voitures
    }

    public boolean ajouter_voiture(Voiture voiture_a_ajouter) {
        if (voiture_a_ajouter.proprietaire != null) {
            System.out.println("Erreur : La voiture est déjà possédée.");
            return false;
        }

        if (nbVoitures >= 3) {
            System.out.println("Erreur : La personne possède déjà le nombre maximum de voitures.");
            return false;
        }

        liste_voitures[nbVoitures] = voiture_a_ajouter;
        nbVoitures++;
        voiture_a_ajouter.proprietaire = this; // Met à jour le propriétaire de la voiture
        return true;
    }
}