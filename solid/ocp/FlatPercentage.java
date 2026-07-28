package solid.ocp;

import solid.srp.Order;

public class FlatPercentage implements Discount {

    public int getDiscount(Order order) {

        int numberOfItems = order.getItems().size();

        return (int) (numberOfItems * 0.5);
    }
}
