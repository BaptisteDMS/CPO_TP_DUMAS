package tp3_heroic_fantasy_dumas;

import java.util.ArrayList;

/**
 *
 * @author baptiste
 */
public class TP3_Heroic_Fantasy_DUMAS {
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Arme> armes = new ArrayList<Arme>();

        Epee epee1 = new Epee("Excalibur", 7, 5);
        Epee epee2 = new Epee("Durandal", 4, 7);
        Baton baton1 = new Baton("Chêne", 4, 5);
        Baton baton2 = new Baton("Charme", 5, 6);

        armes.add(epee1);
        armes.add(epee2);
        armes.add(baton1);
        armes.add(baton2);

        // Utilisez une boucle for avec des indices pour parcourir les armes
        for (int i = 0; i < armes.size(); i++) {
            Arme arme = armes.get(i);
            System.out.println("Arme #" + (i + 1) + ": " + arme);
        }
    }
}

