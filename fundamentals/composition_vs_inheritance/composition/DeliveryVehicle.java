package composition_vs_inheritance.composition;

public class DeliveryVehicle {
    private int speed;
    private int weight;

    int getWeight() {
        return weight;
    }

    void setWeight(int weight) {
        this.weight = weight;
    }

    int getSpeed() {
        return speed;
    }

    void setSpeed(int speed) {
        this.speed = speed;
    }

    DeliveryVehicle(int speed, int weight) {
        this.speed = speed;
        this.weight = weight;
    }

    int timeTaken(int dist) {
        return dist / speed;
    }

    DeliveryVehicle() {
    }
}
