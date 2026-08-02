package association_aggregation_composition;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Order {

    String name;
    Customer customer;

    List<OrderItem> orderItem;

    Order(String name) {
        this.name = name;
        this.orderItem = new ArrayList<>(Arrays.asList(new OrderItem("water")));
    }

    String orderedBy(Customer customer) {
        this.customer = customer;
        return this.name + " was ordered by " + customer.name;
    }

    void setOrderItems(List<String> dishes) {
        List<OrderItem> items = new ArrayList<>();
        for (String dish : dishes) {
            items.add(new OrderItem(dish));
        }
        this.orderItem = items;
    }

}
