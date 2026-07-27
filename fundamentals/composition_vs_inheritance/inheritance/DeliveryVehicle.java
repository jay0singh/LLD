package composition_vs_inheritance.inheritance;

public class DeliveryVehicle {
    int speed;
    int weight;

    DeliveryVehicle() {

    }

    DeliveryVehicle(int speed, int weight) {
        this.speed = speed;
        this.weight = weight;
    }

    int timeTaken(int dist) {
        return dist / speed;
    }
}
