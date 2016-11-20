package net.runnerdave.manufacturing_process.processes;

/**
 * Created by davidajimenez on 19/11/2016.
 */
public class MobilePhoneProcess extends ProductProcess {
    public MobilePhoneProcess(String name) {
        super(name);
    }

    protected void assembly() {
        System.out.println("mobile phone specific assembly");
    }

    protected void testing() {
        System.out.println("mobile phone specific testing");
    }

    protected void packaging() {
        System.out.println("mobile phone specific packaging");
    }

    protected void storing() {
        System.out.println("mobile phone specific storing");
    }
}
