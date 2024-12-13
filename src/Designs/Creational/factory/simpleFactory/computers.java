package src.Designs.Creational.factory.simpleFactory;

public class computers implements product{

    @Override
    public void create(){
        System.out.println("Creating a computer");
    }
}
