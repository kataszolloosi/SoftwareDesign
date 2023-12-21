package VerhaltnisPattern.Simuduck;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Ente> entenhausen = new ArrayList<>();

        Rotkopfente ente1 = new Rotkopfente("Peter die Rotkopfente");
        Stockente ente2 = new Stockente("Hansi die Stockente");
        entenhausen.add(new Gummiente("KingKong die Gummiente"));


        entenhausen.add(ente1);
        entenhausen.add(ente2);
        System.out.println("----");

        for (Ente e : entenhausen) {
            //e.quaken();
            //e.schwimmen();
            //e.fliegen();
            //e.anzeigen();
            e.performFliegen();
        }
    }
}
