package src.Designs.Creational.factory.FactoryMethod;

public class PhoneProduct extends ProducCreation{

    @Override
    public product CreateProduct() {
        return new phones();
    }
}
