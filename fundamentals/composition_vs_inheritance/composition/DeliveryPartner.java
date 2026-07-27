package composition_vs_inheritance.composition;

public class DeliveryPartner {
    private DeliveryVehicle vehicle;

    DeliveryPartner(DeliveryVehicle vehicle) {
        this.vehicle = vehicle;
    }

    int eta(int dist) {
        return vehicle.timeTaken(dist);
    }

    int getMaxWeight() {
        return vehicle.getWeight();
    }

    void assignVehicle(DeliveryVehicle vehicle) {
        this.vehicle = vehicle;
    }

}
