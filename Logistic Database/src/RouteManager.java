package com.gla;

import java.util.*;

class RouteManager<T extends Checkpoint> {

    private final List<T> route = new ArrayList<>();

    // Add checkpoint
    void addCheckpoint(T checkpoint) {
        if (checkpoint == null) return;
        route.add(checkpoint);
    }

    // Remove by ID
    boolean removeCheckpoint(String id) {
        return route.removeIf(c -> c.id.equalsIgnoreCase(id));
    }

    // Find checkpoint
    T findCheckpoint(String id) {
        for (T c : route) {
            if (c.id.equalsIgnoreCase(id)) {
                return c;
            }
        }
        return null;
    }

    // Total distance
    double computeTotalDistance() {
        double total = 0;
        for (T c : route) {
            total += c.distance;
        }
        return total;
    }

    // Total penalty
    double computeTotalPenalty() {
        double total = 0;
        for (T c : route) {
            total += c.Penality();
        }
        return total;
    }

    // Consistency check
    boolean checkConsistency() {
        boolean hasDelivery = false;
        boolean hasFuel = false;

        for (T c : route) {
            if ("Delivery".equalsIgnoreCase(c.getType())) hasDelivery = true;
            if ("Fuel".equalsIgnoreCase(c.getType())) hasFuel = true;
        }

        return hasDelivery && hasFuel;
    }

    // Print route
    void printRoute() {
        if (route.isEmpty()) {
            System.out.println("No checkpoints available.");
            return;
        }

        int i = 1;
        for (T c : route) {
            System.out.printf("%d. %s - %s - %s - Penalty: %.2f%n",
                    i++,
                    c.getType(),
                    c.location,
                    (c.delayedcheck() ? "Delayed" : "On Time"),
                    c.Penality());
        }
    }

    // Route score
    double computeRouteScore() {
        return computeTotalDistance() - computeTotalPenalty();
    }

    // Safe getter (read-only)
    List<T> getAll() {
        return Collections.unmodifiableList(route);
    }
}