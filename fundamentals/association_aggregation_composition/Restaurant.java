package association_aggregation_composition;

public class Restaurant {
    String name;
    Menu menu;

    Restaurant(String name, Menu menu) {
        this.name = name;
        this.menu = menu;
    }

    void setMenu(Menu menu) {
        this.menu = menu;
    }
}
