package solid.lsp;

import solid.srp.Order;

public class Restaurant {
    String name;
    boolean acceptingOrders;

    public void acceptOrder(Order order) {
        if (this.acceptingOrders)
            System.out.println("Order accepted");
        else
            System.out.println("This restaurant is not available at the moment.");
    }

    public Restaurant() {
        this.acceptingOrders = true;
    }
}
