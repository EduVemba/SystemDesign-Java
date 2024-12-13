package src.Designs.Creational.factory.FactoryMethod;

public abstract class ProducCreation {
    public abstract product CreateProduct();

    public void createProduct() {
        product product = CreateProduct();
        product.createProduct();
    }
}
