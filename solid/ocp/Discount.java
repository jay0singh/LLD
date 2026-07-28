package solid.ocp;

import solid.srp.Order;

/**
 * Discount
 */
public interface Discount {

    public int getDiscount(Order order);
}