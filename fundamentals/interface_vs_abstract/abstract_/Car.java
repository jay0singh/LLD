package interface_vs_abstract.abstract_;

public class Car extends Refuel {

    @Override
    public int reportSpeed() {
        return 60;
    }

    @Override
    public int reportMaxWeight() {
        return 100;
    }

    @Override
    String fuelType() {
        return "Diesel";
    }

}
