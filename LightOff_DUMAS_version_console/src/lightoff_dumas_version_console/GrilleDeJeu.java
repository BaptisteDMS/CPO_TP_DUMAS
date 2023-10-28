package lightoff_dumas_version_console;
import java.util.Random;
/**
 *
 * @author baptiste
 */
import java.util.Random;

import java.util.Random;

public class GrilleDeJeu {
    private CelluleLumineuse[][] matriceCellules;
    private int nbLignes;
    private int nbColonnes;

    public GrilleDeJeu(int nbLignes, int nbColonnes) {
        this.nbLignes = nbLignes;
        this.nbColonnes = nbColonnes;
        matriceCellules = new CelluleLumineuse[nbLignes][nbColonnes];

        for (int ligne = 0; ligne < nbLignes; ligne++) {
            for (int colonne = 0; colonne < nbColonnes; colonne++) {
                matriceCellules[ligne][colonne] = new CelluleLumineuse();
            }
        }
    }

    public void eteindreToutesLesCellules() {
        for (int ligne = 0; ligne < nbLignes; ligne++) {
            for (int colonne = 0; colonne < nbColonnes; colonne++) {
                matriceCellules[ligne][colonne].eteindreCellule();
            }
        }
    }

    public void activerLigneDeCellules(int idLigne) {
        if (idLigne >= 0 && idLigne < nbLignes) {
            for (int colonne = 0; colonne < nbColonnes; colonne++) {
                matriceCellules[idLigne][colonne].activerCellule();
            }
        }
    }

    public void activerColonneDeCellules(int idColonne) {
        if (idColonne >= 0 && idColonne < nbColonnes) {
            for (int ligne = 0; ligne < nbLignes; ligne++) {
                matriceCellules[ligne][idColonne].activerCellule();
            }
        }
    }

    public void activerDiagonaleDescendante() {
        int minDim = Math.min(nbLignes, nbColonnes);
        for (int i = 0; i < minDim; i++) {
            matriceCellules[i][i].activerCellule();
        }
    }

    public void activerDiagonaleMontante() {
        int minDim = Math.min(nbLignes, nbColonnes);
        for (int i = 0; i < minDim; i++) {
            matriceCellules[i][nbColonnes - 1 - i].activerCellule();
        }
    }

    public void activerLigneColonneOuDiagonaleAleatoire() {
        Random random = new Random();
        int choix = random.nextInt(4);

        switch (choix) {
            case 0:
                activerLigneDeCellules(random.nextInt(nbLignes));
                break;
            case 1:
                activerColonneDeCellules(random.nextInt(nbColonnes));
                break;
            case 2:
                activerDiagonaleDescendante();
                break;
            case 3:
                activerDiagonaleMontante();
                break;
        }
    }

    public void melangerMatriceAleatoirement(int nbTours) {
        for (int i = 0; i < nbTours; i++) {
            activerLigneColonneOuDiagonaleAleatoire();
        }
    }

    public boolean cellulesToutesEteintes() {
        for (int ligne = 0; ligne < nbLignes; ligne++) {
            for (int colonne = 0; colonne < nbColonnes; colonne++) {
                if (matriceCellules[ligne][colonne].getEtat()) {
                    return false;
                }
            }
        }
        return true;
    }

    public int getNbLignes() {
        return nbLignes;
    }

    public int getNbColonnes() {
        return nbColonnes;
    }

    public CelluleLumineuse getCellule(int ligne, int colonne) {
        if (ligne >= 0 && ligne < nbLignes && colonne >= 0 && colonne < nbColonnes) {
            return matriceCellules[ligne][colonne];
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder affichage = new StringBuilder("  ");
        for (int colonne = 0; colonne < nbColonnes; colonne++) {
            char lettreColonne = (char) ('A' + colonne);
            affichage.append(" ").append(lettreColonne).append(" ");
        }
        affichage.append("\n");

        for (int ligne = 0; ligne < nbLignes; ligne++) {
            affichage.append(String.format("%2d|", ligne + 1));
            for (int colonne = 0; colonne < nbColonnes; colonne++) {
                affichage.append(" ").append(matriceCellules[ligne][colonne]).append(" ");
            }
            affichage.append("\n");
        }

        return affichage.toString();
    }
}
