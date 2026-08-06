package design_patterns.creational.factory;

public class CODPayment implements Payment {

    @Override
    public void pay() {
        System.out.println("Paid using COD");
    }

}
