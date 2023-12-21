package DecoratorPattern_Wrapper;

public abstract class Getraenk {
    protected String beschreibung = "unbekanntes Getraenk";
    //nur abgeleiteten Klassen können zugreifen - protected

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public abstract double kostet();
}
