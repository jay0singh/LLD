package interface_vs_abstract;

import interface_vs_abstract.abstract_.Car;

public class main {
    public static void main(String[] args) {
        Car car = new Car();
        car.refuel();
        System.out.println(car.getFuel());
    }
}
