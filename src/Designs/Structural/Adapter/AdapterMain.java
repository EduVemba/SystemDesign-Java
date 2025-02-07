package src.Designs.Structural.Adapter;

public class AdapterMain {
    public static void main(String[] args) {

        EuropePlug plug = new EuropePlug();
        UsPlog adapter = new PlugAdapter(plug);

        adapter.connect();
    }
}
