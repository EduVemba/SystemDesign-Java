package src.Designs.Behavorial.observer;

public class ConcretSubject extends Subject {
    private String state;

    /**
     * The new notification method
     * @param state
     */
    public void setState(String state) {
        this.state = state;
        notify(state);
    }
    public String getState() {
        return state;
    }
}
