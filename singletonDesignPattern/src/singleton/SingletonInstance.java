package singleton;

public class SingletonInstance {
    private static SingletonInstance singletonInstance;
    private SingletonInstance() {}
    public static SingletonInstance getInstance() {
        if (singletonInstance == null) {
            singletonInstance = new SingletonInstance();
        }
        return singletonInstance;
    }
}
