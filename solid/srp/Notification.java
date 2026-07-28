package solid.srp;

public class Notification {

    public void sendNotification(Order order) {
        int billAmount = order.getTotal();
        System.out
                .println(order.name + " was fulfilled. Thanks visit again!!! You paid " + String.valueOf(billAmount));
    }

}
