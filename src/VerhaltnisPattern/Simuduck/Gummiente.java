package VerhaltnisPattern.Simuduck;

public class Gummiente extends Ente{
    public Gummiente(String name) {
        super(name,null);
    }

    @Override
    public void anzeigen() {
        System.out.println(getName()+" meine Gummistiefel");
    }

    @Override
    public void quaken(){
        System.out.println(getName()+ " quitscht");
    }
}
