package com.gla.GenericsCollections;

class Box<T> {
    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}

public class Main {
    public static void main(String[] args) {

        // Integer
        Box<Integer> intBox = new Box<>();
        intBox.set(100);
        System.out.println("Integer: " + intBox.get());

        // String
        Box<String> strBox = new Box<>();
        strBox.set("Hello World");
        System.out.println("String: " + strBox.get());

        // Double
        Box<Double> dblBox = new Box<>();
        dblBox.set(10.5);
        System.out.println("Double: " + dblBox.get());
    }
}