package net.runnerdave.hr_management_system.observers;

import net.runnerdave.hr_management_system.subjects.EmployeeManagementSystem;
import net.runnerdave.hr_management_system.subjects.ISubject;

/**
 * Created by davidajimenez on 22/11/2016.
 */
public class HRDepartment implements IObserver {
    ISubject mgr;

    public HRDepartment(ISubject mgr) {
        this.mgr = mgr;
        mgr.subscribe(this);
    }

    @Override
    public void callMe() {
        System.out.println("hr department notified");
    }

    @Override
    public void produceEmployeeReport() {
        System.out.println("HR report: ,, " + ((EmployeeManagementSystem)mgr).produceEmployeeReport() + ",,");
    }
}
