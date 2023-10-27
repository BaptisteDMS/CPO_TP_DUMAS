package lightoff_dumas_version_console;
/**
 *
 * la classe represente letat d'une cellule 
 * @author baptiste
 */
public class CelluleLumineuse {
    private boolean etat;

    /**
     *initialise la cellule 
     * Éteinte par défaut
     *
     */
    public CelluleLumineuse() {
        etat = false;
    }

    /**
     *permet d'inverser l'etat de la cellule 
     */
    public void activerCellule() {
        etat = !etat;
    }

    /**
     *Éteindre la cellule
     */
    public void eteindreCellule() {
        etat = false;
    }

    /**
     *permet de verifier si la cellule est eteinte 
     * @return
     */
    public boolean estEteint() {
        return !etat;
    }

    /**
     *renvoie l'etat de la cellule 
     * @return
     */
    public boolean RenvoieEtat() {
        return etat;
    }

    @Override
    public String toString() {
        return etat ? "X" : "O"; // Représentation de l'état
    }
}
