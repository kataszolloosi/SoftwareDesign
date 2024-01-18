package VerhaltnisPattern.Simuduck;

public abstract class Ente {
    private String name;
    private int flugVerhalten; //1-flattern, 2-segeln, 3-boden bleiben
    private Flugverhalten flugverhalten;

    public void setFlugVerhalten(int flugVerhalten) {
        this.flugVerhalten = flugVerhalten;
    }

    public void setFlugverhalten(Flugverhalten flugverhalten) {
        this.flugverhalten = flugverhalten;
    }

    public Ente(String name, Flugverhalten flugverhalten) {
        this.name = name;
//        this.flugVerhalten = flugVerhalten;
        this.flugverhalten = flugverhalten;
        System.out.println("Ente mit dem Namen " + name + " wurde erstellt");
    }

    public void quaken() {  //mit final kann ich override verhindern - geht nicht
        System.out.println(name + " quakt");
    }

    public void schwimmen() {
        System.out.println(name + " schwimmt");

    }

    public void fliegen() {
        switch (flugVerhalten) {
            case 1:
                System.out.println(getName() + " flattert");
                break;
            case 2:
                System.out.println(getName() + "segelt durch den Wind");
                break;
            default: //3
                System.out.println(getName() + " kommt nicht vom Boden");
                break;
        }

    }

    public void performFliegen(){
        if (flugverhalten != null){
            flugverhalten.fliegen();
        }else{
            System.out.println("diese ente kann nicht fliegen, weil flugverhalten == null");
        }
    }

    public abstract void anzeigen();

    public String getName() {
        return name;
    }
}
