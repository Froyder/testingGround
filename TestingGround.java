package ru.geek.homeworks.lesson11.generics;

import ru.geek.homeworks.lesson11.generics.fruitsandboxes.Apple;
import ru.geek.homeworks.lesson11.generics.fruitsandboxes.Box;
import ru.geek.homeworks.lesson11.generics.fruitsandboxes.Orange;

public class TestingGround {

    public static void main(String[] args) {

        Box <Apple> appleBox = new Box();
        Box <Orange> orangeBox = new Box();

        appleBox.putInBox(new Apple(), 4);
        orangeBox.putInBox(new Orange(), 4);

        System.out.println(appleBox);
        System.out.println(orangeBox);

        System.out.println(appleBox.getWeight());
        System.out.println(orangeBox.getWeight());


        //   System.out.println(appleBox.get(0).getClass().getSimpleName());


    }
}
