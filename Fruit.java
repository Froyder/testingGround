package ru.geek.homeworks.lesson11.generics.fruitsandboxes;

public class Fruit {

    private static double WEIGHT;

    public Fruit (double weight) {
        this.WEIGHT = weight;
    }

    public static double getFruitWeight() {
         return WEIGHT;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
