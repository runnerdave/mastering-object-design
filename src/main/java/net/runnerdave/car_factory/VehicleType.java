package net.runnerdave.car_factory;

/**
 * Created by davidajimenez on 21/11/2016.
 */
public enum VehicleType {
    CAR {
        public Vehicle getVehicle() {
            return new Car();
        }
    },
    TRUCK {
        public Vehicle getVehicle() {
            return new Truck();
        }
    };

    public abstract Vehicle getVehicle();
}
