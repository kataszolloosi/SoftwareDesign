package FactoryPattern.Pizza;

public class Main {
    public static void main(String[] args) {

        System.out.println("Helalo world!");
        PizzaStore gStore = new GrazPizzaStore();

        PizzaStore wStore = new WienPizzaStore();

        Pizza pizza1 = gStore.orderPizza("mushroom");
        System.out.println("Ich erhalte folgende Pizza: '" + pizza1 + "'");

        Pizza pizza2 = wStore.orderPizza("vegan");
        System.out.println("Ich erhalte folgende Pizza: '" + pizza2 + "'");

    }
}