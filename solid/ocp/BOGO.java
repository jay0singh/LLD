package solid.ocp;

import solid.srp.Order;

public class BOGO implements Discount {

    @Override
    public int getDiscount(Order order) {
        int numberOfItems = order.getItems().size();
        int finalAmount = numberOfItems % 2 == 1 ? (numberOfItems - 1) / 2 + 1 : (numberOfItems - 1) / 2;

        return finalAmount;
    }
}
