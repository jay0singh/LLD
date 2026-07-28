package solid.srp;

import java.util.ArrayList;
import java.util.List;

import solid.ocp.Discount;

public class Order {

    String name;
    Customer customer;
    List<OrderItem> items;
    int total;
    Discount discount;

    String getName() {
        return this.name;
    }

    public List<OrderItem> getItems() {
        return this.items;
    }

    int getTotal() {
        return this.total;
    }

    void setTotal(int total) {
        this.total = total;
    }

    public void takeOrder(List<String> dishes) {
        List<OrderItem> items = new ArrayList<>();

        for (String dish : dishes) {
            items.add(new OrderItem(dish));
        }

        this.items = items;

    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    public Discount getDiscount() {
        return this.discount;
    }

    public void setName(String name) {
        this.name = name;
    }
}
