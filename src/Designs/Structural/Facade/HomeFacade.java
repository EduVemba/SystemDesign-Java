package src.Designs.Structural.Facade;

public class HomeFacade {
    private final RoomLight roomLight;
    private final BedRoomLight bedRoomLight;
    private final ChickenLight chickenLight;


    public HomeFacade() {
        this.roomLight = new RoomLight();
        this.bedRoomLight = new BedRoomLight();
        this.chickenLight = new ChickenLight();
    }

    public void ligthsOn() throws InterruptedException {
        System.out.println("Siri- Turning on all the lights...");
        Thread.sleep(1000);
        System.out.println("Siri-Turning all the lights");

        // Faking latency
        roomLight.on();
        Thread.sleep(100);
        bedRoomLight.on();
        Thread.sleep(100);
        chickenLight.on();
        Thread.sleep(1000);

        System.out.println("Siri- All lights are now on");
    }
}
