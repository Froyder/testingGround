package ru.geek.homeworks.lesson11.generics.fruitsandboxes;

import java.util.ArrayList;

public class Box <T extends Fruit> extends ArrayList {

    private ArrayList <T> box = new ArrayList<T>();

    public double getWeight() {
        double boxWeight = 0.0;
        for (T object : box){
            boxWeight += object.getFruitWeight();
        }
        return boxWeight;
    }

    public void getInfo () {
        try {
            System.out.println("На корзине написано: " + this.getClass() + ". Всего фруктов: " + this.size());
        } catch (IndexOutOfBoundsException exception) {
            System.out.println("Что-то не так с размером списка!");
        }
    }

    public void putInBox (T object) {
            box.add(object);
    }

    public boolean compare (Box <?> another) {
        return Math.abs(this.getWeight() - another.getWeight()) < 0.0001;
    }

}

/*
Задача:
Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;

Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта,
поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
Для хранения фруктов внутри коробки можно использовать ArrayList;

Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество:
вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);

Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той,
которую подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае.
Можно сравнивать коробки с яблоками и апельсинами;

Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;

Не забываем про метод добавления фрукта в коробку.

 */
