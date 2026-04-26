package com.gla.streamApi;

import java.util.*;
import java.util.stream.*;

class Claim {
    String type;
    double amount;

    Claim(String type, double amount) {
        this.type = type;
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }
}

public class InsuranceAnalysis {
    public static void main(String[] args) {

        List<Claim> claims = Arrays.asList(
                new Claim("Health", 5000),
                new Claim("Vehicle", 12000),
                new Claim("Health", 8000),
                new Claim("Home", 15000),
                new Claim("Vehicle", 10000),
                new Claim("Health", 7000)
        );

        // Group by claim type and calculate average
        Map<String, Double> avgByType = claims.stream()
                .collect(Collectors.groupingBy(
                        Claim::getType,
                        Collectors.averagingDouble(Claim::getAmount)
                ));

        // Display result
        avgByType.forEach((type, avg) ->
                System.out.println(type + " → Average Claim: " + avg)
        );
    }
}