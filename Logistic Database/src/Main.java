package com.gla;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        try {
            // Create Driver
            Driver driver = new Driver("D1204", "Kavita Nair");

            // Add Checkpoints
            driver.addCheckpoint(new Delivery("C1", "Warehouse A", 50, 30, 40));
            driver.addCheckpoint(new FuelCheckPoint("C2", "Pump 12", 20, 15, 15));
            driver.addCheckpoint(new RestCheckpoint("C3", "Motel X", 10, 20, 40));
            driver.addCheckpoint(new Delivery("C4", "Client Hub", 40, 25, 40));

            // Print Route Summary
            driver.printSummary();

            // Save Driver to DB
            RouteDAO.saveDriver(driver);

            // Save All Checkpoints to DB
            for (Checkpoint c : driver.routeHistory) {
                RouteDAO.saveCheckpoint(driver.driverId, c);
            }

            System.out.println("\nData saved successfully to database ✅");

        } catch (Exception e) {
            System.out.println("Error occurred ❌");
            e.printStackTrace();
        }
    }
}
