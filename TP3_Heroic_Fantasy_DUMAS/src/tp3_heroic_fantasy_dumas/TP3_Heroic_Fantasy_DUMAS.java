package tp3_heroic_fantasy_dumas;
/**
 *
 * @author baptiste
 */
public class TP3_Heroic_Fantasy_DUMAS {
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

        // Affichez les caractéristiques des armes en parcourant le tableau dynamique
        for (Arme arme : armes) {
            System.out.println(arme);
        }
    }
}

 