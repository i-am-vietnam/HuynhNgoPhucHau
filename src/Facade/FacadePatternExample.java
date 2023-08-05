package Facade;

public class FacadePatternExample {
    public static void main(String[] args) {
        FlightFacade flightFacade = new FlightFacade();

        System.out.println("Chuẩn bị cất cánh:");
        flightFacade.takeOff();

        System.out.println("\nChuẩn bị hạ cánh:");
        flightFacade.land();
    }
}
