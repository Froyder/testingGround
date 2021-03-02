package ru.geek.homeworks.lesson11.generics.fruitsandboxes;

public class Apple extends Fruit {

    private static final double WEIGHT = 1.0;

    public Apple () {
        super(1.0);
    }

    public static double getFruitWeight() {
        return WEIGHT;
    }

    @Override
    public String toString() {
        return ("Apple");
    }
}

