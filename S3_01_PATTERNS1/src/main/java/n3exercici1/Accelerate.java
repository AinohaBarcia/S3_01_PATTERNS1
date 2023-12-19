package n3exercici1;

public class Accelerate implements ICommandVehicle {
    private IVehicle vehicle;

    public Accelerate(IVehicle vehicle) {
        this.vehicle = vehicle;
    }
    @Override
    public void execute() {
        vehicle.accelerate();
    }
}
