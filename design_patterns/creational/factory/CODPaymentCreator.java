package design_patterns.creational.factory;

public class CODPaymentCreator extends PaymentCreator {

    @Override
    public Payment createPaymentMethod() {
        return new CODPayment();
    }

}
