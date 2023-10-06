package tp2_bieres_dumas;

/**
 *
 * @author baptiste
 */
public class TP2_Bieres_DUMAS {

    public static void main(String[] args) {

 
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls", (float) 7.0, "Dubuisson");
        BouteilleBiere autreBiere = new BouteilleBiere("Leffe", (float) 6.6, "Abbaye de Leffe");
        BouteilleBiere troisiemeBiere = new BouteilleBiere("Bière", (float) 5.0, "Brasserie3");

        uneBiere.lireEtiquette();
        autreBiere.lireEtiquette();
        troisiemeBiere.lireEtiquette();

        uneBiere.Decapsuler();

        System.out.println(uneBiere);
        System.out.println(autreBiere);
        System.out.println(troisiemeBiere);
    }
}
