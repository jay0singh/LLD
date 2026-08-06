package design_patterns.creational.factory;

public abstract class PaymentCreator {

    public abstract Payment createPaymentMethod();

    public void pay() {
        Payment obj = createPaymentMethod();
        obj.pay();
    }

}
