package com.gla.exceptionHandling;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionException {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = 0;
        try{
            z = x/y;
            System.out.println(z);
        }
        catch (ArithmeticException ex) {
            System.out.println("Error: Cannot divide by zero");
        }
        catch (InputMismatchException ex) {
            System.out.println("Error: Please enter numeric values only");
        }
        System.out.println("main ending");
    }

}
