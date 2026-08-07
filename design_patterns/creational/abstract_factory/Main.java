package design_patterns.creational.abstract_factory;

public class Main {
    public static void main(String[] args) {
        RegionFactory factory;
        Logistics logistics;

        factory = new INFactory();
        logistics = new Logistics(factory);
        logistics.log();

        factory = new USFactory();
        logistics = new Logistics(factory);
        logistics.log();
    }
}
