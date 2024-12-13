package src.Designs.Creational.factory.FactoryMethod;

public class ComputerProduct extends ProducCreation{

    @Override
    public product CreateProduct() {
        return new computers();
    }
}
