package DecoratorPattern_Wrapper;

public class Sirup extends ZutatDecorator {
    public Sirup(Getraenk getraenk) {
        super(getraenk);
    }

    @Override
    public String getBeschreibung() {
        return getraenk.getBeschreibung() + ", " +"Sirup";
    }

    public double kostet() {
        return getraenk.kostet() + 0.5;
    }
}
