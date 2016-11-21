package net.runnerdave.car_factory;

/**
 * Created by davidajimenez on 21/11/2016.
 */
public class VehicleFactory {

    public Vehicle getVehicle(VehicleType type){
        return type.getVehicle();
    }
}
