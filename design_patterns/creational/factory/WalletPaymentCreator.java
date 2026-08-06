package design_patterns.creational.factory;

public class WalletPaymentCreator extends PaymentCreator {

    @Override
    public Payment createPaymentMethod() {
        return new WalletPayment();
    }

}
