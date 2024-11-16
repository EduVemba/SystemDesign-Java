package src.Designs.Behavorial.observer;

import src.Designs.Behavorial.observer.Observer;

public interface Observable {

    /**
     *
     * @param observer
     */
    void addObserver(Observer[] observer);

    /**
     *
     * @param observer
     */
    void deleteObserver(Observer observer);

    /**
     * notify the observer (message,post,email,live,etc.)
     * @param obj, is the notification
     */
    void notify(Object obj);
}
