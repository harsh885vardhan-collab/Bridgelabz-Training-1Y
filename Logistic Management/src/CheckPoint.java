package Logistic;

abstract class CheckPoint {
    String id;
    String location;
    double distance;
    int expected_time;
    int actual_time;

    public CheckPoint(String id, String location, double distance, int expected_time, int actual_time){
        this.id = id;
        this.location = location;
        this.distance = distance;
        this.expected_time = expected_time;
        this.actual_time = actual_time;
    }
    public boolean delayedcheck(){
        return actual_time > expected_time;
    }

    public abstract boolean isCritical();

    public abstract String getType();

    public abstract double Penality();
}
