package FactoryPattern.Pizza;

public class GrazPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String item) {
        if (item.equals("mushroom")) {
            return new GrazMushroomPizza();
        } else if (item.equals("veggie")) {
            return new GrazVeggiePizza();
        } else if (item.equals("vegan")) {
            return new GrazVeganPizza();
        } else {
            return null;
        }
    }
}
