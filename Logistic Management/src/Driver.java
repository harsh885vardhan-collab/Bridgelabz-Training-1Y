package Logistic;

public class Driver {
    String name;
    String id;
    RouteLinkedList<CheckPoint> routehistory;
            ;
    public Driver(String name, String id) {
        this.name = name;
        this.id = id;
        this.routehistory = new RouteLinkedList<>();
    }
}
