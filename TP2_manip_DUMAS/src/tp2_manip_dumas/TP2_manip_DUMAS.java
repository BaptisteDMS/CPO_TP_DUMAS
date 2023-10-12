
package tp2_manip_dumas;

/**
 *
 * @author bapti
 */
public class TP2_manip_DUMAS {
    public static void main(String[] args) {
        Tartiflette assiette1 = new Tartiflette(500);
        Tartiflette assiette2 = new Tartiflette(600);
        Tartiflette assiette3 = assiette2; // assiette2 et assiette3 référencent la même tartiflette

        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories);
        System.out.println("nb de calories de Assiette 3 : " + assiette3.nbCalories);

        // Modifier les calories d'une tartiflette
        assiette2.nbCalories = 700;

        System.out.println("nb de calories de Assiette 2 après modification : " + assiette2.nbCalories);
        System.out.println("nb de calories de Assiette 3 après modification : " + assiette3.nbCalories);

        // Inverser les objets référencés par assiette1 et assiette2
        Tartiflette temp = assiette1;
        assiette1 = assiette2;
        assiette2 = temp;

        System.out.println("nb de calories de Assiette 1 après inversion : " + assiette1.nbCalories);
        System.out.println("nb de calories de Assiette 2 après inversion : " + assiette2.nbCalories);

        // Ligne 6 : Moussaka assiette666 = assiette1; -> incorrect car assiette1 est de type Tartiflette
        // Ligne 7 : Moussaka assiette667 = new Tartiflette(); -> incorrect car vous essayez de créer une Tartiflette dans une variable de type Moussaka

        // Créer un tableau de 10 références de Moussaka
        Moussaka[] moussakas = new Moussaka[10];

        // Pour chacune de ces références, créez un nouvel objet de type Moussaka
        for (int i = 0; i < moussakas.length; i++) {
            moussakas[i] = new Moussaka(i * 100);
        }
    }
}    
}
