package src.Designs.Behavorial.observer;

public interface Observer {

    /**
     * When an observer is notified execute this method
     * @param obj
     */
    void update(Object obj);
}
