package lightoff_dumas_version_console;
/**
 *
 * la classe represente letat d'une cellule 
 * @author baptiste
 */
public class CelluleLumineuse {
    private boolean etat;

    public CelluleLumineuse() {
        // Initialise la cellule en état éteint
        etat = false;
    }

    public void activerCellule() {
        // Inverse l'état de la cellule
        etat = !etat;
    }

    public void eteindreCellule() {
        // Éteint la cellule
        etat = false;
    }

    public boolean estEteint() {
        return !etat;
    }

    public boolean getEtat() {
        return etat;
    }

    @Override
    public String toString() {
        return etat ? "X" : "O";
    }
}
