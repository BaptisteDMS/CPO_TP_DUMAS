package lightoff_dumas_version_console;

/**
 *
 * @author baptiste
 */
public class LightOff_DUMAS_version_console {
    public static void main(String[] args) {
        // Création de deux cellules lumineuses
        CelluleLumineuse cellule1 = new CelluleLumineuse();
        CelluleLumineuse cellule2 = new CelluleLumineuse();

        // Affichage de l'état initial des cellules
        System.out.println("Etat initial 1 : " + cellule1);
        System.out.println("Etat initial 2 : " + cellule2);

        // Activation de la cellule 1
        cellule1.activerCellule();

        // Affichage de l'état après activation
        System.out.println("Apres activation, etat de la cellule 1 : " + cellule1);
        System.out.println("Etat de la cellule 2 (non modifiee) : " + cellule2);

        // Éteindre la cellule 2
        cellule2.eteindreCellule();

        // Affichage de l'état après extinction
        System.out.println("Etat de la cellule 1 (non modifiee) : " + cellule1);
        System.out.println("Apres extinction, etat de la cellule 2 : " + cellule2);

     GrilleDeJeu grille = new GrilleDeJeu(4, 4); // Par exemple, une grille de 4x4 cellules

        // Affichez la grille avec System.out.println
        System.out.println(grille);
    }
}
