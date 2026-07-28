package solid;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import solid.ocp.BOGO;
import solid.srp.*;

public class main {
    public static void main(String[] args) {
        Order order = new Order();
        order.setDiscount(new BOGO());
        Total total = new Total();
        Notification notification = new Notification();
        SaveOrder saveOrder = new SaveOrder();

        List<String> list = new ArrayList<>(Arrays.asList("Water", "Chowmein", "Coke"));
        order.takeOrder(list);
        order.setName("Order Number 1");
        total.getFinalAmount(order);
        saveOrder.save(order);
        notification.sendNotification(order);
    }
}
