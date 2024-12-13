package src.Designs.Creational.factory.simpleFactory;

public class FactoryMain {
    public static void main(String[] args) {

        product phoneProduct = new phones();
        product computerProduct = new computers();
        product televisionProduct = new television();

        phoneProduct.create();
        computerProduct.create();
        televisionProduct.create();

    }
}
