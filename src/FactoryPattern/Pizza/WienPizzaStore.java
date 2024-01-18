package FactoryPattern.Pizza;

public class WienPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String item) {
        if (item.equals("mushroom")) {
            return new WienMushroomPizza();
        } else if (item.equals("veggie")) {
            return new WienVeggiePizza();
        } else if (item.equals("vegan")) {
            return new WienVeganPizza();
        } else {
            return null;
        }
    }
}
