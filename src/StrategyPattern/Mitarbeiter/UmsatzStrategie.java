package StrategyPattern.Mitarbeiter;

public class UmsatzStrategie implements ProvisionsStrategie {
    @Override
    public double berechnen(Mitarbeiter m) {
        System.out.println("Umsatz: " + m.getUmsatz() + " *0.5 = ");
        return m.getUmsatz() * 0.5;
    }
}
