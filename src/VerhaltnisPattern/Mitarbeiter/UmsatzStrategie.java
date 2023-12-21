package VerhaltnisPattern.Mitarbeiter;

public class UmsatzStrategie implements ProvisionsStrategie {
    @Override
    public void berechnen() {
        System.out.println("Umsatz - 5%");
    }
}
