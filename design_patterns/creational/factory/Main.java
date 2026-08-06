package design_patterns.creational.factory;

public class Main {
    public static void main(String[] args) {
        PaymentCreator creator;

        creator = new UPIPaymentCreator();
        creator.pay();

        creator = new CODPaymentCreator();
        creator.pay();

        creator = new WalletPaymentCreator();
        creator.pay();

        creator = new CCPaymentCreator();
        creator.pay();

    }
}
