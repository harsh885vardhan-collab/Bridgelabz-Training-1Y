package com.gla.streamApi;

import java.util.*;
import java.util.stream.*;
class Doctor {
    String name;
    String specialty;
    boolean weekendAvailable;

    Doctor(String name, String specialty, boolean weekendAvailable) {
        this.name = name;
        this.specialty = specialty;
        this.weekendAvailable = weekendAvailable;
    }

    @Override
    public String toString() {
        return name + " | " + specialty + " | Weekend Available: " + weekendAvailable;
    }
}
public class Hospital {
    public static void main(String[] args) {

        List<Doctor> doctors = Arrays.asList(
                new Doctor("Dr. Sharma", "Cardiology", true),
                new Doctor("Dr. Mehta", "Neurology", false),
                new Doctor("Dr. Singh", "Orthopedics", true),
                new Doctor("Dr. Gupta", "Dermatology", true),
                new Doctor("Dr. Khan", "Pediatrics", false)
        );

        List<Doctor> availableDoctors = doctors.stream()

                // Filter: Only weekend available doctors
                .filter(d -> d.weekendAvailable)

                // Sort: By specialty (A → Z)
                .sorted(Comparator.comparing(d -> d.specialty))

                // Collect results
                .collect(Collectors.toList());

        // Display result
        System.out.println("Doctors available on weekends:");
        availableDoctors.forEach(System.out::println);
    }
}