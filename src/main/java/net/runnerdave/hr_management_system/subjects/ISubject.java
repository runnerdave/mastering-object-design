package net.runnerdave.hr_management_system.subjects;

import net.runnerdave.hr_management_system.observers.IObserver;

/**
 * Created by davidajimenez on 20/11/2016.
 */
public interface ISubject {
    public void notifyObservers();

    public void subscribe(IObserver o);

    public void unsubscribe(IObserver o);
}
