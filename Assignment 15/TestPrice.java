package com.gla.GenericsCollections;

import java.util.*;

class Product {
    double price;

    public Product(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}

class Mobile extends Product {
    String name;

    public Mobile(String name, double price) {
        super(price);
        this.name = name;
    }

    public String toString() {
        return "Mobile: " + name + " Price: " + price;
    }
}

class Laptop extends Product {
    String name;

    public Laptop(String name, double price) {
        super(price);
        this.name = name;
    }

    public String toString() {
        return "Laptop: " + name + " Price: " + price;
    }
}

class PriceUtil {
    public static double calculateTotal(List<? extends Product> items) {
        double total = 0;

        for(Product p : items) {
            total += p.getPrice();
        }

        return total;
    }
}

public class TestPrice {
    public static void main(String[] args) {

        List<Mobile> mobiles = Arrays.asList(
                new Mobile("iPhone", 80000),
                new Mobile("Samsung", 50000)
        );

        List<Laptop> laptops = Arrays.asList(
                new Laptop("Dell", 70000),
                new Laptop("HP", 60000)
        );

        System.out.println("Total Mobile Price: " + PriceUtil.calculateTotal(mobiles));
        System.out.println("Total Laptop Price: " + PriceUtil.calculateTotal(laptops));
    }
}