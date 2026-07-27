package composition_vs_inheritance.inheritance;

public class DeliveryPartner {

    private DeliveryVehicle vehicle;

    int eta(int dist) {
        return vehicle.timeTaken(dist);
    }

    DeliveryPartner(DeliveryVehicle vehicle) {
        this.vehicle = vehicle;
    }

    int getMaxWeight() {
        return vehicle.weight;
    }

    void assignVehicle(DeliveryVehicle vehicle) {
        this.vehicle = vehicle;
    }
}