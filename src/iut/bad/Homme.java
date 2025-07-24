package iut.bad;

public class Homme extends Humain {
    private String nom;

    public Homme(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

    private String prenom;
    private int age;
}
