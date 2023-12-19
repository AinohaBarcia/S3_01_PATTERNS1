package n3exercici1;

public class Bicicle implements IVehicle{
    @Override
    public void accelerate() {
        System.out.println("The bicile is accelerating");
    }

    @Override
    public void startUp() {
        System.out.println("The bicile is start up");
    }

    @Override
    public void brakeVehicle() {
        System.out.println("The bicile is braking");
    }
}
