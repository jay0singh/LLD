package solid.srp;

public class Total {

    public int getFinalAmount(Order order) {
        int discount = order.getDiscount().getDiscount(order);
        int amount = order.getItems().size();

        order.total = amount - discount;
        return amount - discount;
    }

}
