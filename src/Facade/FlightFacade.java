package Facade;

public class FlightFacade {
    private Airplane airplane;
    private Engine engine;
    private SoundSystem soundSystem;

    public FlightFacade() {
        this.airplane = new Airplane();
        this.engine = new Engine();
        this.soundSystem = new SoundSystem();
    }

    public void takeOff() {
        airplane.turnOn();
        engine.start();
        soundSystem.turnOn();
        airplane.takeOff();
    }

    public void land() {
        airplane.land();
        engine.stop();
        soundSystem.turnOff();
        airplane.turnOff();
    }
}
