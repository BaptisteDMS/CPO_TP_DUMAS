package Personnages;
import Armes.Arme;
import Armes.Epee;

/**
 *
 * @author baptiste
 */

import java.util.ArrayList;

import java.util.ArrayList;

public class Guerrier extends Personnage {
    private boolean aCheval;

    public Guerrier(String nom, int niveauDeVie, boolean aCheval) {
        super(nom, niveauDeVie);
        this.aCheval = aCheval;
    }

    public boolean isACheval() {
        return aCheval;
    }

    public void setACheval(boolean aCheval) {
        this.aCheval = aCheval;
    }

    @Override
    public String toString() {
        String info = "Guerrier : " + super.toString();
        info += "\nÀ cheval : " + (aCheval ? "Oui" : "Non");
        if (getArmeEnMain() != null) {
            info += "\nArme en main : " + getArmeEnMain();
        }
        return info;
    }
    
    // Méthode pour choisir une arme de l'inventaire et l'équiper
    public void choisirArme(String nomArme) {
        Arme armeTrouvee = null;
        for (Arme arme : getInventaire()) {
            if (arme.getNom().equals(nomArme)) {
                armeTrouvee = arme;
                break;
            }
        }
        
        if (armeTrouvee != null) {
            setArmeEnMain(armeTrouvee);
            System.out.println(getNom() + " a équipé " + nomArme);
        } else {
            System.out.println("Arme non trouvée dans l'inventaire de " + getNom());
        }
    }
}
