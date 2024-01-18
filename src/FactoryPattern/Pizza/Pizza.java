package FactoryPattern.Pizza;

public class Pizza {
    protected String name;
    void box() {
        System.out.println("Pizza '" + name + "': wird in einen umweltfreundlichen Ökokarton " +
                "eingepackt und mit Liebe verschlossen.");
    }
    public String toString() {
        return name;
    }
    void prepare() {
        System.out.println("Pizza '" + name + "': wird vorbereitet.");
    }
    void bake() {
        System.out.println("Pizza '" + name + "': wird gebacken für 2min 30s.");
    }
    void cut() {
        System.out.println("Pizza '" + name + "': wird geschnitten.");
    }
}
