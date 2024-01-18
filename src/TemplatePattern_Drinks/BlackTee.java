package TemplatePattern_Drinks;

public class BlackTee extends CaffeineBeverage{
    @Override
    protected void brew() {
        System.out.println("Steep BlackTee leaves 5 minutes");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Add honey in BlackTee");
    }
}
