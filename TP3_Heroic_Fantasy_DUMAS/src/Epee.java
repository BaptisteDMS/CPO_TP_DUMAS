/**
 *
 * @author baptiste
 */
public class Epee extends Arme {
    private final int indiceFinesse;

    public Epee(String nom, int niveauAttaque, int indiceFinesse) {
        super(nom, niveauAttaque);
        this.indiceFinesse = indiceFinesse;
    }
    
    public int getIndiceFinesse() {
        return indiceFinesse;
    }

    public void actionSpecifique() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
