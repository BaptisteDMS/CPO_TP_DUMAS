package tp3_heroic_fantasy_dumas;

import java.util.ArrayList;

import java.util.ArrayList;
import Armes.Arme;
import Armes.Baton;
import Armes.Epee;
import Personnages.Magicien;
import Personnages.Guerrier;
import Personnages.Personnage;

public class TP3_Heroic_Fantasy_DUMAS {
    public static void main(String[] args) {
        Epee epee1 = new Epee("Excalibur", 7, 5);
        Epee epee2 = new Epee("Durandal", 4, 7);
        Baton baton1 = new Baton("Chêne", 4, 5);
        Baton baton2 = new Baton("Charme", 5, 6);

        Guerrier guerrier = new Guerrier("Guerrier1", 100, false);
        Magicien magicien = new Magicien("Magicien1", 100, false);

        Epee epee3 = new Epee("Epee1", 10, 5);
        Epee epee4 = new Epee("Epee2", 10, 5);
        Epee epee5 = new Epee("Epee3", 10, 5);

        Baton baton3 = new Baton("Baton1", 10, 5);
        Baton baton4 = new Baton("Baton2", 10, 5);
        Baton baton5 = new Baton("Baton3", 10, 5);

        guerrier.ajouterArme(epee3);
        guerrier.ajouterArme(epee4);
        guerrier.ajouterArme(baton3);

        guerrier.choisirArme("Epee1");

        magicien.ajouterArme(baton1);
        magicien.ajouterArme(baton2);
        magicien.ajouterArme(epee1);

        int nombreDeBatons = magicien.compterArmesDePredilection(Baton.class);
        System.out.println("Nombre de bâtons préférés du magicien : " + nombreDeBatons);

        ArrayList<Arme> armes = new ArrayList<>();
        armes.add(epee1);
        armes.add(epee2);
        armes.add(baton1);
        armes.add(baton2);
        armes.add(epee3);
        armes.add(epee4);
        armes.add(epee5);
        armes.add(baton3);
        armes.add(baton4);
        armes.add(baton5);

        ArrayList<Personnage> personnages = new ArrayList<>();
        personnages.add(guerrier);
        personnages.add(magicien);

        for (Arme arme : armes) {
            System.out.println(arme);
        }

        for (Personnage personnage : personnages) {
            System.out.println(personnage);
        }
    }
}
