package com.gla.GenericsCollections;

class CompareUtil {

    public static <T> boolean isEqual(T a, T b) {
        if(a == null && b == null) return true;
        if(a == null || b == null) return false;
        return a.equals(b);
    }
}

public class TestCompare {
    public static void main(String[] args) {

        System.out.println(CompareUtil.isEqual(10, 10));          // true
        System.out.println(CompareUtil.isEqual("Hello", "Hello"));// true
        System.out.println(CompareUtil.isEqual(10.5, 20.5));      // false
        System.out.println(CompareUtil.isEqual(null, null));      // true
    }
}