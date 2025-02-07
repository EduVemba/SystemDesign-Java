package src.Designs.Creational.singleton;

/**
 * class Singleton
 */
public class Singleton {
   // we encapsulate the class parameter with a static keyword
   // so it can be accessed in any part of the code
    private static volatile Singleton instance;

    // the constructor is private so it cannot create a new instance
    private Singleton() {}


    // verifies if the instance is created if is not creates one.
    public static Singleton getInstance() {
        synchronized (Singleton.class) {
            if (instance == null) {
                instance = new Singleton();
            }
            return instance;
        }
    }
}
