package VerhaltnisPattern.Mitarbeiter;

import java.util.ArrayList;

public class MitarbeiterManager {
    ArrayList<Mitarbeiter> mitarbeiterListe = new ArrayList<>();
    private ProvisionsStrategie ps;

    public MitarbeiterManager(ProvisionsStrategie ps){
        this.ps = ps;
    }

    public void setProvision(ProvisionsStrategie p){
        ps = p;
    }
    public void addMitarbeiter(Mitarbeiter m){
        mitarbeiterListe.add(m);
    }

    public void berechneProvision() {
        if (mitarbeiterListe != null) {
            for(Mitarbeiter m : mitarbeiterListe){
                System.out.print(m.getName() + " ");
                System.out.println(ps.berechnen(m));
            }
        }
    }
}
