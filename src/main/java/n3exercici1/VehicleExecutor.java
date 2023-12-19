package n3exercici1;

public class VehicleExecutor{

    private ICommandVehicle vehicleExecutor;

    public void setVehicleExecutor(ICommandVehicle vehicleExecutor) {
        this.vehicleExecutor = vehicleExecutor;
    }

    public void executeOperation(){
        vehicleExecutor.execute();
    }
}
