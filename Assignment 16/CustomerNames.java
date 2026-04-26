package com.gla.streamApi;

import java.util.*;
import java.util.stream.*;

public class CustomerNames {
    public static void main(String[] args) {

        List<String> names = Arrays.asList(
                "Amit", "riya", "Karan", "sneha", "Rahul"
        );

        List<String> result = names.stream()

                // Convert to uppercase
                .map(name -> name.toUpperCase())

                // Sort alphabetically
                .sorted()

                // Collect result
                .collect(Collectors.toList());

        // Display result
        System.out.println("Formatted Names:");
        result.forEach(System.out::println);
    }
}