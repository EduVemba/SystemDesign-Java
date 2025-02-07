package src.Designs.Structural.Facade;

public class FacadeMain {
    public static void main(String[] args) throws InterruptedException {

        HomeFacade facade = new HomeFacade();

        facade.ligthsOn();
    }
}
