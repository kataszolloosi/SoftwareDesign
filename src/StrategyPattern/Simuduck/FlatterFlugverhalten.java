package StrategyPattern.Simuduck;

public class FlatterFlugverhalten implements Flugverhalten{
    @Override
    public void fliegen() {
        System.out.println("FlatterFlugverhalten --------- Ente SEGELT");
    }
}
