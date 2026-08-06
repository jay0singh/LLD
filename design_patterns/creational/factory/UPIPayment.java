package design_patterns.creational.factory;

public class UPIPayment implements Payment {
    @Override
    public void pay() {
        System.out.println("Paid with UPI");
    }
}
