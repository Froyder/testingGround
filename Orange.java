package ru.geek.homeworks.lesson11.generics.fruitsandboxes;

public class Orange extends Fruit {

    private static final double WEIGHT = 1.5;

    public Orange () {
        super(1.5);
    }

    public static double getFruitWeight() {
        return WEIGHT;
    }

    @Override
    public String toString() {
        return ("Orange");
    }
}
