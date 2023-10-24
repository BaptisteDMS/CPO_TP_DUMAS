package Personnages;

import java.util.ArrayList;
import Armes.Arme;

public abstract class Personnage {
    private String nom;
    private int niveauDeVie;
    ArrayList<Arme> inventaire = new ArrayList<Arme>();
    private Arme armeEnMain = null;

    public Personnage(String nom, int niveauDeVie) {
        this.nom = nom;
        this.niveauDeVie = niveauDeVie;
    }

    public void ajouterArme(Arme arme) {
        if (inventaire.size() < 5) {
            inventaire.add(arme);
            System.out.println(arme.getNom() + " a été ajouté à l'inventaire de " + nom);
        } else {
            System.out.println(nom + " ne peut pas porter plus de 5 armes.");
        }
    }

    public void equiperArme(String nomArme) {
        for (Arme arme : inventaire) {
            if (arme.getNom().equals(nomArme)) {
                armeEnMain = arme;
                System.out.println(nom + " a équipé " + nomArme);
                return;
            }
        }
        System.out.println(nom + " n'a pas trouvé " + nomArme + " dans son inventaire.");
    }

    public String toString() {
        String str = "Nom: " + nom + ", Niveau de vie: " + niveauDeVie;
        if (armeEnMain != null) {
            str += ", Arme en main: " + armeEnMain;
        }
        return str;
    }

    public abstract int compterArmesDePredilection(String type);
}