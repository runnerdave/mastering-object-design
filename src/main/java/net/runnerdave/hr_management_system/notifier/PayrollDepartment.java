package net.runnerdave.hr_management_system.notifier;

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

    }
}
