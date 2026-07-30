package solid.isp;

public class PartnerKiosk implements OrderOps {

    @Override
    public void acceptOrder() {
        System.out.println("Partner Kiosk accepted the order.");
    }

}
