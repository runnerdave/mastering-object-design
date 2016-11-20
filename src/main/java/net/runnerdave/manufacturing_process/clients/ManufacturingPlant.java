package net.runnerdave.manufacturing_process.clients;

import net.runnerdave.manufacturing_process.processes.LaptopProcess;
import net.runnerdave.manufacturing_process.processes.MobilePhoneProcess;
import net.runnerdave.manufacturing_process.processes.ProductProcess;

/**
 * Created by davidajimenez on 19/11/2016.
 */
public class ManufacturingPlant {
    public static void main(String[] args) {
        System.out.println("== Welcome to the Manufacturing Plant ==");
        ProductProcess mobilePhone = new MobilePhoneProcess("iphone");
        mobilePhone.process();
        System.out.println("== " + mobilePhone.getProcessName() + " built ==");
        ProductProcess laptop = new LaptopProcess("macbook");
        laptop.process();
        System.out.println("== " + laptop.getProcessName() + " built ==");
    }
}
