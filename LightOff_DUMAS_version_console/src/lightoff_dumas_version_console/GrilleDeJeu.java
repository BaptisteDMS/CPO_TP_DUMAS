package lightoff_dumas_version_console;
import java.util.Random;
/**
 *
 * @author baptiste
 */
public class GrilleDeJeu {
    private CelluleLumineuse[][] matriceCellules;
    private int nbLignes;
    private int nbColonnes;

    public GrilleDeJeu(int p_nbLignes, int p_nbColonnes) {
        nbLignes = p_nbLignes;
        nbColonnes = p_nbColonnes;
        matriceCellules = new CelluleLumineuse[nbLignes][nbColonnes];

        // Initialisation de la matrice de cellules
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

        if (choix == 0) {
            activerLigneDeCellules(rand.nextInt(nbLignes));
        } else if (choix == 1) {
            activerColonneDeCellules(rand.nextInt(nbColonnes));
        } else {
            activerDiagonaleDescendante();
        }
    }

    public void melangerMatriceAleatoirement(int nbTours) {
        eteindreToutesLesCellules();
        Random rand = new Random();

        for (int tour = 0; tour < nbTours; tour++) {
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
        StringBuilder builder = new StringBuilder();
        
        // Affichage de l'en-tête des colonnes
        builder.append(" |");
        for (int j = 0; j < nbColonnes; j++) {
            builder.append(" ").append(j).append(" |");
        }
        builder.append("\n");

        // Ligne de séparation
        builder.append(new String(new char[4 * nbColonnes + 3]).replace('\0', '-')).append("\n");

        // Affichage de l'état des cellules
        for (int i = 0; i < nbLignes; i++) {
            builder.append(i).append("|");
            for (int j = 0; j < nbColonnes; j++) {
                builder.append(" ").append(matriceCellules[i][j]).append(" |");
            }
            builder.append("\n");

            // Ligne de séparation
            builder.append(new String(new char[4 * nbColonnes + 3]).replace('\0', '-')).append("\n");
        }
        return builder.toString();
     
    }
}


