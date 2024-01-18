package VerhaltnisPattern.Mitarbeiter;

public class Mitarbeiter {
    private String name;
    private double gewinn;
    private double umsatz;

    public Mitarbeiter(String name, int gewinn, int umsatz) {
        this.name = name;
        this.gewinn = gewinn;
        this.umsatz = umsatz;
    }

    public String getName() {
        return name;
    }

    public double getGewinn() {
        return gewinn;
    }

    public double getUmsatz() {
        return umsatz;
    }
}
