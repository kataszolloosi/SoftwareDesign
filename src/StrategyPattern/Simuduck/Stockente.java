package StrategyPattern.Simuduck;

public class Stockente extends Ente{

    public Stockente(String name ) {
        super(name, new FlatterFlugverhalten());
    }

    @Override
    public void anzeigen() {
        System.out.println(getName() + " meine stocke Kopf");
    }

}
