package interface_vs_abstract.abstract_;

public class MotorBike extends Refuel {

    String fuelType() {
        return "Performance";
    }

    void refuelBike() {
        refuel();
    }

    public int reportSpeed() {
        return 45;
    }

    public int reportMaxWeight() {
        return 15;
    }

}
