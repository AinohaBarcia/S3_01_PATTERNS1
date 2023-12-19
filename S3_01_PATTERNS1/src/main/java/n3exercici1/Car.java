package n3exercici1;

public class Car implements IVehicle{

    @Override
    public void accelerate() {
        System.out.println("The car is accelerating");
    }

    @Override
    public void startUp() {
        System.out.println("The car is start up");
    }

    @Override
    public void brakeVehicle() {
        System.out.println("The car is braking");
    }
}
