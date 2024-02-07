package StrategyPattern.Simuduck;

public class Rotkopfente extends Ente {
    public Rotkopfente(String name) {
        super(name, new SegelFlugverhalten());
    }

    @Override
    public void anzeigen() {
        System.out.println(getName() + " meine rote Kopf");
    }
}
