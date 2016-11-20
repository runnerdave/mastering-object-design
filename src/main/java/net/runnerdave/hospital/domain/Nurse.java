package net.runnerdave.hospital.domain;

/**
 * Created by davidajimenez on 19/11/2016.
 */
public class Nurse extends Employee {
    public Nurse(long id, String name, String department, boolean working) {
        super(id, name, department, working);
    }

    public void performDuties() {
        checkVitals();
        drawBlood();
        cleanPatientArea();
    }

    public void checkVitals() {
        System.out.println("Performing vitals...");
    }

    public void drawBlood() {
        System.out.println("Drawing blood...");
    }

    public void cleanPatientArea() {
        System.out.println("Cleaning patient area...");
    }
}
