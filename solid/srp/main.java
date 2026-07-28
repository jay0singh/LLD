package solid.srp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class main {
    public static void main(String[] args) {
        Order order = new Order();
        Total total = new Total();
        Notification notification = new Notification();
        SaveOrder saveOrder = new SaveOrder();

        List<String> list = new ArrayList<>(Arrays.asList("Water", "Chowmein", "Coke"));
        order.takeOrder(list);
        order.name = "Order Number 1";
        total.getFinalAmount(order);
        saveOrder.save(order);
        notification.sendNotification(order);
    }
}
