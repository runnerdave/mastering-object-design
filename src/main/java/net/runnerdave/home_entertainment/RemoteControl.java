package net.runnerdave.home_entertainment;

/**
 * Created by davidajimenez on 19/11/2016.
 */
public class RemoteControl {
    private Device device;
    private static final RemoteControl instance = new RemoteControl();
    private RemoteControl(){}
    public static RemoteControl getInstance() {
        return instance;
    }
    static void chooseDevice(Device dv){
        instance.device = dv;
    }
    public void turnDeviceOn() {
        device.turnOn();
    }
    public void turnDeviceOff() {
        device.turnOff();
    }
}
