package net.runnerdave.manufacturing_process.processes;

/**
 * Created by davidajimenez on 19/11/2016.
 */
public class LaptopProcess extends ProductProcess {
    public LaptopProcess(String name) {
        super(name);
    }

    protected void assembly() {
        System.out.println("laptop specific assembly");
    }

    protected void testing() {
        System.out.println("laptop specific testing");
    }

    protected void packaging() {
        System.out.println("laptop specific packaging");
    }

    protected void storing() {
        System.out.println("laptop specific storing");
    }


}
