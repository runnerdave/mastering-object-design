package net.runnerdave.hr_management_system.notifier;

import net.runnerdave.hr_management_system.domain.Employee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by davidajimenez on 20/11/2016.
 */
public class EmployeeManagementSystem implements ISubject {
    List<IObserver> observers = new ArrayList<>();
    Map<String, Employee> employees = new HashMap<>();

    public void hireNewEmployee(Employee emp) {
        employees.put(emp.getName(), emp);
        notifyObservers();
    }

    public void fireEmployee(Employee emp) {
        employees.remove(emp.getName());
        notifyObservers();
    }

    public void modifyEmployeeName(Employee emp) {
        //TODO: modify name
    }


    @Override
    public void notifyObservers() {
        for (IObserver obs : observers
                ) {
            obs.callMe();
        }
    }

    @Override
    public void subscribe(IObserver o) {
        observers.add(o);
    }

    @Override
    public void unsubscribe(IObserver o) {
        observers.remove(o);
    }
}
