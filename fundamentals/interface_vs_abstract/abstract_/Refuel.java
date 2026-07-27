package interface_vs_abstract.abstract_;

import interface_vs_abstract.interface_.Report;

public abstract class Refuel implements Report {

    int fuel;
    int cost;

    public int getFuel() {
        return fuel;
    }

    abstract String fuelType();

    public void refuel() {
        if (fuelType().equals("Performance"))
            this.cost += 100;
        else
            this.cost += 80;
        this.fuel += 10;
    }
}
