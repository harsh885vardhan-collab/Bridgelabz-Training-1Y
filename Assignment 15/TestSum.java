package com.gla.GenericsCollections;

import java.util.*;

class NumberUtil {

    public static double sumNumbers(List<? extends Number> list) {
        double sum = 0;

        for(Number n : list) {
            sum += n.doubleValue();
        }

        return sum;
    }
}

public class TestSum {
    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(1, 2, 3, 4);
        List<Double> doubleList = Arrays.asList(2.5, 3.5, 4.0);

        System.out.println("Sum of Integers: " + NumberUtil.sumNumbers(intList));
        System.out.println("Sum of Doubles: " + NumberUtil.sumNumbers(doubleList));
    }
}