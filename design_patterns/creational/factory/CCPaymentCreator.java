package design_patterns.creational.factory;

public class CCPaymentCreator extends PaymentCreator {

    @Override
    public Payment createPaymentMethod() {
        return new CCPayment();
    }

}
