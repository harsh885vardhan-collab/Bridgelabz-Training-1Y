package com.gla.exceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.net.StandardSocketOptions;

public class FileRead {
    static void main() {
        try{
            FileReader fr = new FileReader("data.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        System.out.println("Main Ending");
    }
}
