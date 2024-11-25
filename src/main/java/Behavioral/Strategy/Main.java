package Behavioral.Strategy;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Truck();
        Car c2 = new Taxi();
        c1.action();
        c2.action();
    }
}