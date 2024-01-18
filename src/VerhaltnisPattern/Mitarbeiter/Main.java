package VerhaltnisPattern.Mitarbeiter;

public class Main {
    public static void main(String[] args) {

        MitarbeiterManager mm = new MitarbeiterManager(new GewinnStrategie());

        mm.addMitarbeiter(new Mitarbeiter("Kata", 125, 2500));
        mm.addMitarbeiter(new Mitarbeiter("Nora", 95, 1750));


        mm.berechneProvision();
        System.out.println();
        mm.setProvision(new UmsatzStrategie());
        mm.berechneProvision();


    }


}
