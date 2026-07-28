package solid.srp;

import java.util.List;

public class Total {

    int getFinalAmount(Order order) {
        List<OrderItem> items = order.getItems();

        int amount = 0;

        for (OrderItem item : items) {
            amount += 1;
        }

        order.total = amount;
        return amount;
    }

}
