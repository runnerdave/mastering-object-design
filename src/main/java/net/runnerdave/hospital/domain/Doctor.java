package net.runnerdave.hospital.domain;

/**
 * Created by davidajimenez on 19/11/2016.
 */
public class Doctor extends Employee {
    public Doctor(long id, String name, String department, boolean working) {
        super(id, name, department, working);
    }

    public void performDuties() {
        diagnosePatients();
        prescribeMedicine();
    }

    public void prescribeMedicine() {
        System.out.println("Prescribing medicine...");
    }

    public void diagnosePatients() {
        System.out.println("Diagnosing patients...");
    }


}
