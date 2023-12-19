package n3exercici1;

public class BrakeVehicle implements ICommandVehicle {
    private IVehicle vehicle;

    public BrakeVehicle(IVehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void execute() {
        vehicle.brakeVehicle();
    }
}
