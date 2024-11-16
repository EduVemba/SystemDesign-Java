package src.Designs.Behavorial.observer;


/**
 * The Observers that are going to receive the notification
 */
public class ConcreteObserver implements Observer {
    private String name;

    public ConcreteObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(Object obj) {
        System.out.println(name + " Received: " + obj);
    }
}
