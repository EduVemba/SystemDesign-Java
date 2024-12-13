package src.Designs.Creational.factory.FactoryMethod;

public class FactoryMethodMain {
    public static void main(String[] args) {

        ProducCreation computerProduct = new ComputerProduct();
        ProducCreation phoneProduct = new PhoneProduct();


        computerProduct.createProduct();
        phoneProduct.createProduct();
    }
}
