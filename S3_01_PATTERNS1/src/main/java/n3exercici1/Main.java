package n3exercici1;

public class Main {
    public static void main(String[] args) {
       Car car = new Car();
       Bicicle bicicle = new Bicicle();
       Ship ship = new Ship();
       Plane plane = new Plane();

        VehicleExecutor vehicleExecutor = new VehicleExecutor();

        System.out.println("Now we prove the car:");
        vehicleExecutor.setVehicleExecutor(() -> car.accelerate());
        vehicleExecutor.executeOperation();
        vehicleExecutor.setVehicleExecutor(() -> car.brakeVehicle());
        vehicleExecutor.executeOperation();
        vehicleExecutor.setVehicleExecutor(() -> car.startUp());
        vehicleExecutor.executeOperation();

        System.out.println();

        System.out.println("Now we prove the bicicle:");
        vehicleExecutor.setVehicleExecutor(() -> bicicle.accelerate());
        vehicleExecutor.executeOperation();
        vehicleExecutor.setVehicleExecutor(() -> bicicle.brakeVehicle());
        vehicleExecutor.executeOperation();
        vehicleExecutor.setVehicleExecutor(() -> bicicle.startUp());
        vehicleExecutor.executeOperation();

        System.out.println();

        System.out.println("Now we prove the plane:");
        vehicleExecutor.setVehicleExecutor(() -> plane.accelerate());
        vehicleExecutor.executeOperation();
        vehicleExecutor.setVehicleExecutor(() -> plane.brakeVehicle());
        vehicleExecutor.executeOperation();
        vehicleExecutor.setVehicleExecutor(() -> plane.startUp());
        vehicleExecutor.executeOperation();

        System.out.println();

        System.out.println("Now we prove the ship:");
        vehicleExecutor.setVehicleExecutor(() -> ship.accelerate());
        vehicleExecutor.executeOperation();
        vehicleExecutor.setVehicleExecutor(() -> ship.brakeVehicle());
        vehicleExecutor.executeOperation();
        vehicleExecutor.setVehicleExecutor(() -> ship.startUp());
        vehicleExecutor.executeOperation();

    }
}
