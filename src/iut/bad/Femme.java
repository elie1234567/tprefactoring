package iut.bad;

public class Femme extends Humain {
    private String nom;

    public Femme(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

    private String prenom;
    private int age;
}
