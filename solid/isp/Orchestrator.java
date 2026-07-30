package solid.isp;

public class Orchestrator implements RestaurantOps, OrderOps, AnalyticOps, AdminOps {

    @Override
    public void manageStaffSchedule() {
        System.out.println("Staff managed");
    }

    @Override
    public void viewEarningsReport() {
        System.out.println("Earnings reported");
    }

    @Override
    public void acceptOrder() {
        System.out.println("Order accepted");
    }

    @Override
    public void updateMenu() {
        System.out.println("Menu updated");
    }

}
