package solid.srp;

import java.util.List;

public class Total {

    public int getFinalAmount(Order order) {
        int discount = order.getDiscount().getDiscount(order);
        List<OrderItem> items = order.getItems();

        int amount = 0;

        for (OrderItem item : items) {
            amount += 1;
        }

        order.total = amount - discount;
        return amount - discount;
    }

}
