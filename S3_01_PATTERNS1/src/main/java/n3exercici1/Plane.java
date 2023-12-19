package n3exercici1;

public class Plane implements IVehicle{
    @Override
    public void accelerate() {
        System.out.println("The plane is accelerating");
    }

    @Override
    public void startUp() {
        System.out.println("The plane is start up");
    }

    @Override
    public void brakeVehicle() {
        System.out.println("The plane is braking");
    }
}
