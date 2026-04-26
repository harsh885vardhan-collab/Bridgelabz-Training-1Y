package com.gla.streamApi;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.*;

import java.time.LocalDate;

class Member {
    String name;
    LocalDate expiryDate;

    Member(String name, LocalDate expiryDate) {
        this.name = name;
        this.expiryDate = expiryDate;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    @Override
    public String toString() {
        return name + " | Expiry: " + expiryDate;
    }
}

public class Gym {
    public static void main(String[] args) {

        List<Member> members = Arrays.asList(
                new Member("Amit", LocalDate.now().plusDays(10)),
                new Member("Riya", LocalDate.now().plusDays(40)),
                new Member("Karan", LocalDate.now().plusDays(25)),
                new Member("Sneha", LocalDate.now().plusDays(5)),
                new Member("Rahul", LocalDate.now().plusDays(60))
        );

        LocalDate today = LocalDate.now();
        LocalDate next30Days = today.plusDays(30);

        List<Member> expiringSoon = members.stream()

                // Filter members expiring within next 30 days
                .filter(m -> !m.getExpiryDate().isBefore(today) &&
                        !m.getExpiryDate().isAfter(next30Days))

                .collect(Collectors.toList());

        System.out.println("Members expiring within 30 days:");
        expiringSoon.forEach(System.out::println);
    }
}