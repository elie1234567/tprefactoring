package iut.bad;

public class Humain implements Consommation {
    private String jours;

    @Override
    public String toString() {
        return "Humain{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", age=" + age +
                '}';
    }

    protected String nom;
    protected String prenom;

    public Humain() {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

    protected int age;
    public void details() {
        System.out.println(this.toString());
    }
    public void manger() {
        System.out.println(prenom + " est en train de manger.");
    }

    public void boire() {
        System.out.println(prenom + " est en train de boire.");
    }

    public void ami(Humain h) {
        ami(h, 100); // Par défaut, 100 jours
    }

    public void ami(Humain h, int jours) {
        System.out.println(this.nom + " et " + h.nom + " sont amis pour " + jours + " jours.");
    }
}
