package net.runnerdave.cars_with_spring.clients;

import net.runnerdave.cars_with_spring.vehicles.Vehicle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by davidajimenez on 20/11/2016.
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("== Welcome to the Vehicle application powered by Spring ==");
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Vehicle aCar = (Vehicle)context.getBean("mrBeansCar");
        aCar.crankIgnition();

//        without spring:
//        Vehicle raceCar = new Vehicle(new LargeEngine(500));
//        raceCar.crankIgnition();

    }
}
