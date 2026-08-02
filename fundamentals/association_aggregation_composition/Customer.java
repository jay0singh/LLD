package association_aggregation_composition;

public class Customer {

    String name;

    Customer(String name) {
        this.name = name;
    }

    String ordered(Order order) {
        return this.name + " ordered " + order.name;
    }
}
