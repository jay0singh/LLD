package solid.srp;

import java.util.ArrayList;
import java.util.List;

public class Order {

    String name;
    Customer customer;
    List<OrderItem> items;
    int total;

    String getName() {
        return this.name;
    }

    List<OrderItem> getItems() {
        return this.items;
    }

    int getTotal() {
        return this.total;
    }

    void setTotal(int total) {
        this.total = total;
    }

    void takeOrder(List<String> dishes) {
        List<OrderItem> items = new ArrayList<>();

        for (String dish : dishes) {
            items.add(new OrderItem(dish));
        }

        this.items = items;

    }
}
