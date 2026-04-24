package com.gla.GenericsCollections;

class Fruit {
    String name;

    public Fruit(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}

class Apple extends Fruit {
    public Apple(String name) {
        super(name);
    }
}

class Mango extends Fruit {
    public Mango(String name) {
        super(name);
    }
}

class FruitBox<T extends Fruit> {
    private java.util.List<T> list = new java.util.ArrayList<>();

    public void add(T fruit) {
        list.add(fruit);
    }

    public void display() {
        for(T f : list) {
            System.out.println(f);
        }
    }
}

class Car {
    String model;
    public Car(String model) {
        this.model = model;
    }
}

public class TestFruitBox {
    public static void main(String[] args) {

        FruitBox<Fruit> box = new FruitBox<>();

        box.add(new Apple("Red Apple"));
        box.add(new Mango("Alphonso Mango"));

        box.display();

    }
}