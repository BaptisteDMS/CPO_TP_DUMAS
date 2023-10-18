/**
 *
 * @author baptiste
 */
public class Baton extends Arme {
    private final int age;

    public Baton(String nom, int niveauAttaque, int age) {
        super(nom, niveauAttaque);
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}