package Mitarbeiter;

import java.util.ArrayList;

public class MitarbeiterManager {
    ArrayList<Mitarbeiter> mitarbeiterListe = new ArrayList<>();
    private ProvisionsStrategie ps;

    public MitarbeiterManager(ProvisionsStrategie ps){
        this.ps = ps;
    }

    public void addMitarbeiter(Mitarbeiter m){
        mitarbeiterListe.add(m);
        System.out.println("Mitarbeiter: " + m.getName()+ "zu Liste hinzugefügt");
    }

    public void berechneProvision() {
        if (mitarbeiterListe != null) {
            ps.berechnen();
        } else {
            System.out.println("ps == null");
        }
    }
}
