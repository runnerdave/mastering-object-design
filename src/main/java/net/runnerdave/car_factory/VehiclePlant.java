package net.runnerdave.car_factory;

/**
 * Created by davidajimenez on 21/11/2016.
 */
public class VehiclePlant {
    public static void main(String[] args) {
        System.out.println("== Welcome to the car factory ==");
        Vehicle car = new VehicleFactory().getVehicle(VehicleType.CAR);
        car.startEngine();
        Vehicle truck = new VehicleFactory().getVehicle(VehicleType.TRUCK);
        truck.startEngine();
    }
}
