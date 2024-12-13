package src.Designs.Creational.factory.FactoryMethod;

public class phones implements product{

    @Override
    public void createProduct() {
        System.out.println("Creating Phones");
    }
}
