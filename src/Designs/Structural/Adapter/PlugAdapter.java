package src.Designs.Structural.Adapter;

// Adapter that adapt ates to the user input
public class PlugAdapter implements UsPlog{
    private final EuropePlug europePlug;

    // Constructor so when we call the Adapter whe input the type whe want to adapt to
    public PlugAdapter(EuropePlug europePlug) {
        this.europePlug = europePlug;
    }

    @Override
    public void connect() {
        System.out.println("Connecting to european plug...");
        europePlug.plugIn();
    }
}
