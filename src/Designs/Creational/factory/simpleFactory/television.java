package src.Designs.Creational.factory.simpleFactory;

public class television implements product{

    @Override
    public void create(){
        System.out.println("Creating television");
    }
}
