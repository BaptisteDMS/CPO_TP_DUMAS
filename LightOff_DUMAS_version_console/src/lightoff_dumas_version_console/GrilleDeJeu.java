package lightoff_dumas_version_console;
import java.util.Random;
/**
 *
 * @author baptiste
 */
import java.util.Random;

public class GrilleDeJeu {
    private CelluleLumineuse[][] matriceCellules;
    private int nbLignes;
    private int nbColonnes;

    public GrilleDeJeu(int p_nbLignes, int p_nbColonnes) {
        nbLignes = p_nbLignes;
        nbColonnes = p_nbColonnes;
        matriceCellules = new CelluleLumineuse[nbLignes][nbColonnes];

        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                matriceCellules[i][j] = new CelluleLumineuse();
            }
        }
    }

    public void eteindreToutesLesCellules() {
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                matriceCellules[i][j].eteindreCellule();
            }
        }
    }

    public void activerLigneColonneOuDiagonaleAleatoire() {
        Random rand = new Random();
        int choix = rand.nextInt(3);

        switch (choix) {
            case 0:
                activerLigneDeCellules(rand.nextInt(nbLignes));
                break;
            case 1:
                activerColonneDeCellules(rand.nextInt(nbColonnes));
                break;
            case 2:
                int diagChoice = rand.nextInt(2);
                if (diagChoice == 0) {
                    activerDiagonaleDescendante();
                } else {
                    activerDiagonaleMontante();
                }
                break;
        }
    }

    public void melangerMatriceAleatoirement(int nbTours) {
        for (int i = 0; i < nbTours; i++) {
            eteindreToutesLesCellules();
            activerLigneColonneOuDiagonaleAleatoire();
        }
    }

    public void activerLigneDeCellules(int idLigne) {
        for (int j = 0; j < nbColonnes; j++) {
            matriceCellules[idLigne][j].activerCellule();
        }
    }

    public void activerColonneDeCellules(int idColonne) {
        for (int i = 0; i < nbLignes; i++) {
            matriceCellules[i][idColonne].activerCellule();
        }
    }

    public void activerDiagonaleDescendante() {
        int min = Math.min(nbLignes, nbColonnes);
        for (int i = 0; i < min; i++) {
            matriceCellules[i][i].activerCellule();
        }
    }

    public void activerDiagonaleMontante() {
        int min = Math.min(nbLignes, nbColonnes);
        for (int i = 0; i < min; i++) {
            matriceCellules[i][nbColonnes - 1 - i].activerCellule();
        }
    }

    public boolean cellulesToutesEteintes() {
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                if (!matriceCellules[i][j].estEteint()) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < nbLignes; i++) {
            result.append("| ");
            for (int j = 0; j < nbColonnes; j++) {
                result.append(matriceCellules[i][j].toString()).append(" | ");
            }
            result.append("\n--------------------------------\n");
        }
        return result.toString();
    }

    public int getNbLignes() {
        return nbLignes;
    }

    public int getNbColonnes() {
        return nbColonnes;
    }
}
