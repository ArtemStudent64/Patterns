package Behavioral.Strategy;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Truck extends Car {
    private int capacity;

    public Truck() {
        this.action = new BehavioralTruck();
    }

    public Truck(int capacity) {
        this.action = new BehavioralTruck();
        this.capacity = capacity;
    }



    public int getCapacity() {
        return capacity;
    }
}
