package com.gla;

abstract class Checkpoint {
    String id;
    String location;
    double distance;
    int expected_time;
    int actual_time;

    public Checkpoint(String id, String location, double distance, int expected_time, int actual_time){
        this.id = id;
        this.location = location;
        this.distance = distance;
        this.expected_time = expected_time;
        this.actual_time = actual_time;
    }
     boolean delayedcheck(){
        return actual_time > expected_time;
    }

     abstract boolean isCritical();

     abstract String getType();

     abstract double Penality();
}
