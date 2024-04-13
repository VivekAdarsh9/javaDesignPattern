import singleton.SingletonInstance;

public class Main {
    public static void main(String[] args) {

        System.out.println(SingletonInstance.getInstance().hashCode());
        System.out.println(SingletonInstance.getInstance().hashCode());
        System.out.println(SingletonInstance.getInstance().hashCode());
        System.out.println(SingletonInstance.getInstance().hashCode());
    }
}