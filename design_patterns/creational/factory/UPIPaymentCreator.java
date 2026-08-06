package design_patterns.creational.factory;

public class UPIPaymentCreator extends PaymentCreator {

    @Override
    public Payment createPaymentMethod() {
        return new UPIPayment();
    }
}
