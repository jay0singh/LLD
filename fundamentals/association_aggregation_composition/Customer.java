package association_aggregation_composition;

public class Customer {

    String name;

    Customer(String name) {
        this.name = name;
    }

    String ordered(Order order) {
        return new String(this.name + " ordered " + order.name);
    }
}
