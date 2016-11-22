package net.runnerdave.hr_management_system.observers;

import net.runnerdave.hr_management_system.subjects.EmployeeManagementSystem;
import net.runnerdave.hr_management_system.subjects.ISubject;

/**
 * Created by davidajimenez on 20/11/2016.
 */
public class PayrollDepartment implements IObserver {

    ISubject mgr;

    public PayrollDepartment(ISubject mgr) {
        this.mgr = mgr;
        mgr.subscribe(this);
    }

    @Override
    public void callMe() {
        System.out.println("payroll department notified!");
    }

    @Override
    public void produceEmployeeReport() {
        System.out.println("Payroll report: $$ " + ((EmployeeManagementSystem)mgr).produceEmployeeReport() + "$$");
    }
}
