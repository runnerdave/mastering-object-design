package net.runnerdave.cars_with_spring.vehicles;

import net.runnerdave.cars_with_spring.parts.Engine;

/**
 * Created by davidajimenez on 20/11/2016.
 */
public class Vehicle {
    private Engine myEngine;

    public Vehicle(Engine myEngine) {
        this.myEngine = myEngine;
    }

    public void crankIgnition() {
        myEngine.startEngine();
        System.out.println("Vehicle is running");
    }
}
