package n3exercici1;

public class Ship implements IVehicle{
    @Override
    public void accelerate() {
        System.out.println("The ship is accelerating");
    }

    @Override
    public void startUp() {
        System.out.println("The ship is start up");
    }

    @Override
    public void brakeVehicle() {
        System.out.println("The ship is braking");
    }
}
