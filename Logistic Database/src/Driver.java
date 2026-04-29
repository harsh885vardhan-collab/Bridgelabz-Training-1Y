package com.gla;
import java.util.*;

class Driver {
    String driverId;
    String name;
    List<Checkpoint> routeHistory = new ArrayList<>();

    public Driver(String id, String name) {
        this.driverId = id;
        this.name = name;
    }

    void addCheckpoint(Checkpoint c) {
        routeHistory.add(c);
    }

    boolean removeCheckpoint(String id) {
        return routeHistory.removeIf(c -> c.id.equals(id));
    }

    Checkpoint findCheckpoint(String id) {
        for (Checkpoint c : routeHistory) {
            if (c.id.equals(id)) return c;
        }
        return null;
    }

    double computeTotalDistance() {
        double total = 0;
        for (Checkpoint c : routeHistory) {
            total += c.distance;
        }
        return total;
    }

    double computeTotalPenalty() {
        double total = 0;
        for (Checkpoint c : routeHistory) {
            total += c.Penality();
        }
        return total;
    }

    boolean checkConsistency() {
        boolean hasDelivery = false;
        boolean hasFuel = false;

        for (Checkpoint c : routeHistory) {
            if (c.getType().equals("Delivery")) hasDelivery = true;
            if (c.getType().equals("Fuel")) hasFuel = true;
        }

        return hasDelivery && hasFuel;
    }

    void printSummary() {
        System.out.println("Driver: " + driverId + " - " + name);
        System.out.println("\nRoute Summary:");

        int i = 1;
        for (Checkpoint c : routeHistory) {
            System.out.println(i++ + ". " + c.getType() + " - " + c.location +
                    " - " + (c.delayedcheck() ? "Delayed" : "On Time") +
                    " - Penalty: " + c.Penality());
        }

        double distance = computeTotalDistance();
        double penalty = computeTotalPenalty();

        System.out.println("\nTotal Distance: " + distance + " km");
        System.out.println("Total Penalty: " + penalty);
        System.out.println("Route Score: " + (distance - penalty));
        System.out.println("Critical Route Check: " +
                (checkConsistency() ? "Valid" : "Invalid"));
    }
}