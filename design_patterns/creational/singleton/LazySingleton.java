package design_patterns.creational.singleton;

public class LazySingleton {
    private static LazySingleton instance;

    private LazySingleton() {
    }

    static LazySingleton getInstance() {
        if (instance == null)
            instance = new LazySingleton();
        return instance;
    }
}
