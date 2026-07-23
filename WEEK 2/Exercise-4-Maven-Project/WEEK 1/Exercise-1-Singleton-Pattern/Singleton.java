public class Singleton {

    private static Singleton instance;

    private Singleton() {
        System.out.println("Singleton Object Created");
    }

    public static Singleton getInstance() {

        if (instance == null) {
            instance = new Singleton();
        }

        return instance;
    }

    public void display() {
        System.out.println("Welcome to Cognizant Java FSE");
    }
}