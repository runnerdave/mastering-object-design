package net.runnerdave.home_entertainment;

/**
 * Created by davidajimenez on 19/11/2016.
 */
public class Person {

    public static void main(String[] args) {
        System.out.println("== Welcome to the Home Entertainment System ==");
        TV tv = new TV();
        RemoteControl.chooseDevice(tv);
        RemoteControl remoteControl = RemoteControl.getInstance();
        remoteControl.turnDeviceOn();

        Projector projector = new Projector();
        RemoteControl.chooseDevice(projector);
        remoteControl.turnDeviceOn();

        SurroundSoundSystem ss = new SurroundSoundSystem();
        RemoteControl.chooseDevice(ss);
        remoteControl.turnDeviceOn();

        RemoteControl.chooseDevice(tv);
        remoteControl.turnDeviceOff();
    }
}
