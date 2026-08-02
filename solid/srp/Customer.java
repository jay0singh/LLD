package solid.srp;

class Customer {
    String name;

    Customer(String name) {
        this.name = name;
    }

    String ordered(Order order) {
        return this.name + " ordered " + order.getName();
    }
}