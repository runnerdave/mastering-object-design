package net.runnerdave.hospital.actors;

import net.runnerdave.hospital.domain.Employee;

/**
 * Created by davidajimenez on 19/11/2016.
 */
public class HospitalManager {
    public void callUpon(Employee emp) {
        emp.performDuties();
    }
}
