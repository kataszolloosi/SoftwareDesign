package ObserverPattern.Medienverlag;

public class SMSAbonnent implements AbonnentIn {


    private String name;
    private Medienverlag medienverlag;
    public SMSAbonnent(String name, Medienverlag mv) {
        this.name=name;
        this.medienverlag=mv;
        System.out.println("--SMSAbonnent " + name + " erstellt.");
        medienverlag.addSubscriber(this);
    }

    @Override
    public void erhalte(Artikel artikel) {
        System.out.println("SMSAbonnent "+ name + " hat einen neuen Artikel erhalten, mit dem Title: "
                + artikel.getTitle());
    }

    @Override
    public String getName() {
        return name;
    }
}
