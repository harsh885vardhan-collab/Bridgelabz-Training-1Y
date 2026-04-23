package com.gla.exceptionHandling;
import java.util.Scanner;

public class ArrayExceptionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = null;
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        if (n > 0) {
            arr = new int[n];
            System.out.println("Enter elements:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
        }
        System.out.print("Enter index: ");
        int index = sc.nextInt();
        try {
            int value = arr[index];   // may throw exceptions
            System.out.println("Value at index " + index + ": " + value);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");
        }
        catch (NullPointerException e) {
            System.out.println("Array is not initialized!");
        }
    }
}
