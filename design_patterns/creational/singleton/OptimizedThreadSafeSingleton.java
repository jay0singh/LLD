package design_patterns.creational.singleton;

public class OptimizedThreadSafeSingleton {
    private static volatile OptimizedThreadSafeSingleton instance;

    private OptimizedThreadSafeSingleton() {
    }

    public static OptimizedThreadSafeSingleton getInstance() {
        if (instance == null) {
            synchronized (OptimizedThreadSafeSingleton.class) {
                if (instance == null)
                    instance = new OptimizedThreadSafeSingleton();
            }
        }
        return instance;
    }
}
