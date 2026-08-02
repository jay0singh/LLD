package design_patterns.creational.singleton;

public class EagerSingleton {
    private static EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {
    }

    static EagerSingleton getInstance() {
        return instance;
    }
}
