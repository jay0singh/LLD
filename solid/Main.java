package solid;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import solid.lsp.Restaurant;
import solid.dip.MySQLOrderRepository;
import solid.dip.OrderService;
import solid.dip.SmsNotifierImpl;
import solid.lsp.ClosedRestaurant;
import solid.ocp.BOGO;
import solid.srp.*;

public class Main {
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

        List<Restaurant> list2 = new ArrayList<>(Arrays.asList(new Restaurant(), new ClosedRestaurant()));

        for (Restaurant res : list2) {
            res.acceptOrder(order);
        }

        OrderService service = new OrderService(new MySQLOrderRepository(), new SmsNotifierImpl());
        service.serviceMethod();
    }
}
