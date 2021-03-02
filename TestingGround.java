package ru.geek.homeworks.lesson11.generics;

import ru.geek.homeworks.lesson11.generics.fruitsandboxes.Apple;
import ru.geek.homeworks.lesson11.generics.fruitsandboxes.Box;
import ru.geek.homeworks.lesson11.generics.fruitsandboxes.Orange;

public class TestingGround {

    public static void main(String[] args) {

               Box <Apple> appleBox = new Box();
        Box <Orange> orangeBox = new Box();
        Apple apple = new Apple(1);
        Apple apple1 = new Apple(1);
        Apple apple2 = new Apple(1);
        Orange orange = new Orange(1.5);
        Orange orange1 = new Orange(1.5);
        Orange orange2 = new Orange(1.5);

        appleBox.putInBox(apple);
        appleBox.putInBox(apple1);
        appleBox.putInBox(apple2);

        orangeBox.putInBox(orange);
        orangeBox.putInBox(orange1);
        orangeBox.putInBox(orange2);

        appleBox.getInfo();

        System.out.println(appleBox.getWeight());
        System.out.println(orangeBox.getWeight());

        appleBox.compare(orangeBox);


    }
}
