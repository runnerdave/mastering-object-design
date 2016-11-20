package net.runnerdave.home_entertainment;

/**
 * Created by davidajimenez on 19/11/2016.
 */
public class TV extends Device {
    public void turnOn() {
        System.out.println("turning on the TV");
        changeChannelToFavorite();
    }

    public void turnOff() {
        System.out.println("turning off the TV");
    }

    public void changeChannelToFavorite() {
        System.out.println("changing channel to favorite");
    }
}
