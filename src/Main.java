import iut.bad.Femme;
import iut.bad.Homme;
import iut.bad.Humain;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Entrée with your caret at the highlighted text to see how
        Homme h = new Homme("Dupont", "Jean", 30);
        Femme f = new Femme("Durand", "Marie", 28);

        h.ami(f);
        f.ami(h, 200);
        }
    }
