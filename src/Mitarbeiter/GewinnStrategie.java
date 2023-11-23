package Mitarbeiter;

public class GewinnStrategie implements ProvisionsStrategie {
    @Override
    public void berechnen() {
        System.out.println("Gewinn + 10%");
    }

    public GewinnStrategie() {
        System.out.println("neue GewinnStrategie erstellt");
    }
}
