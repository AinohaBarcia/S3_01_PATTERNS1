package n3exercici1;

public class StartUp implements ICommandVehicle {

    private IVehicle vehicle;

    public StartUp(IVehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void execute() {
        vehicle.startUp();
    }
}
