package Behavioral.Strategy;

public class Taxi extends Car {
    private int seats;

    Taxi (){
        this.action = new BehavioralTaxi();
    }
}
