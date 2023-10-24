package Personnages;

import java.util.ArrayList;

import Armes.Arme;

public class Magicien extends Personnage {
    private boolean confirme;

    public Magicien(String nom, int niveauDeVie, boolean confirme) {
        super(nom, niveauDeVie);
        this.confirme = confirme;
    }

    public boolean isConfirme() {
        return confirme;
    }

    public void setConfirme(boolean confirme) {
        this.confirme = confirme;
    }

    @Override
    public String toString() {
        String info = "Magicien : " + super.toString();
        info += " Magicien confirmé : " + (confirme ? "Oui" : "Non");
        if (getArmeEnMain() != null) {
            info += " Arme en main : " + getArmeEnMain();
        }
        return info;
    }

    public int compterArmesDePredilection(Class<? extends Arme> typeArme) {
        int count = 0;
        for (Arme arme : getInventaire()) {
            if (typeArme.isInstance(arme)) {
                count++;
            }
        }
        return count;
    }

    @Override
    public int compterArmesDePredilection(String type) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private Object getArmeEnMain() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private Iterable<Arme> getInventaire() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
