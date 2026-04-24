package com.gla.GenericsCollections;

class MaxUtil {

    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T max = x;

        if(y.compareTo(max) > 0) {
            max = y;
        }
        if(z.compareTo(max) > 0) {
            max = z;
        }

        return max;
    }
}

public class TestMaximum {
    public static void main(String[] args) {

        System.out.println(MaxUtil.maximum(10, 20, 15));        // Integer
        System.out.println(MaxUtil.maximum(5.5, 2.3, 9.1));     // Double
        System.out.println(MaxUtil.maximum("Apple", "Banana", "Mango")); // String
    }
}