package IteratorPattern.Text;

public class Main {
    public static void main(String[] args) {
        TextListe tl = new TextListe("Hansi geht Schi fahren");

        for (String w : tl) {
            System.out.println(w);
        }
    }
}
