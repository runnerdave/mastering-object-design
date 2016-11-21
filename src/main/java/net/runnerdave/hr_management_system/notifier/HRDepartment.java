package net.runnerdave.hr_management_system.notifier;

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

    }
}
