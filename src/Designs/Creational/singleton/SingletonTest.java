package src.Designs.Creational.singleton;

public class SingletonTest {
    public static void main(String[] args) {

        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();


        // Will print true because they are the same instance
        boolean result = s1 == s2;
        System.out.println(result);
    }
}
