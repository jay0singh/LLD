package design_patterns.creational.factory;

public class WalletPayment implements Payment {

    @Override
    public void pay() {
        System.out.println("Paid using Wallet");
    }

}
