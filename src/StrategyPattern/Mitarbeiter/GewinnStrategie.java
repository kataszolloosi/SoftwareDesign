package StrategyPattern.Mitarbeiter;

public class GewinnStrategie implements ProvisionsStrategie {
    @Override
    public double berechnen(Mitarbeiter m) {
        System.out.println("Gewinn: " + m.getGewinn() + " * 0.1 = ");
        return m.getGewinn() * 0.1;
    }

}
