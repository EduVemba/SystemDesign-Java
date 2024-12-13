package src.Designs.Creational.factory.FactoryMethod;

public class computers implements product{

    @Override
    public void createProduct() {
        System.out.println("Creating a computer");
    }
}
