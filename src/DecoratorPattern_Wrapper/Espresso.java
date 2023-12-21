package DecoratorPattern_Wrapper;

public class Espresso extends Getraenk {
    public Espresso() {
        beschreibung = "Espresso";
    }

    @Override
    public double kostet() {
        return 2.5;
    }
}
