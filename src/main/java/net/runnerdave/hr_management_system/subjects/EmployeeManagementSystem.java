package net.runnerdave.hr_management_system.subjects;

import net.runnerdave.hr_management_system.database.EmployeeDAO;
import net.runnerdave.hr_management_system.domain.Employee;
import net.runnerdave.hr_management_system.observers.IObserver;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by davidajimenez on 20/11/2016.
 */
public class EmployeeManagementSystem implements ISubject {
    List<IObserver> observers = new ArrayList<>();

    public EmployeeManagementSystem(EmployeeDAO employees) {
        this.employees = employees;
    }

    EmployeeDAO employees;

    public void hireNewEmployee(Employee emp) {
        employees.addEmployee(emp);
        System.out.println("new employee hired, name:" + emp.getName());
        notifyObservers();
    }

    public void fireEmployee(int empID) {
        Employee emp = employees.getEmployees().remove(empID);
        if (emp != null) {
            System.out.println("old employee fired, name:" + emp.getName());
            notifyObservers();
        } else {
            System.out.println("no employee found to fire");
        }

    }

    public void modifyEmployeeName(int empID, String newName) {
        Employee emp2 = employees.getEmployeeByID(empID);
        if (emp2 != null ) {
            emp2.setName(newName);
            notifyObservers();
        } else {
            System.out.println("no employee found to modify name");
        }
    }

    public String produceEmployeeReport(){
        StringBuilder b = new StringBuilder();
        employees.getEmployees().forEach((k,v)->b.append(v.toString()).append("\n"));
        return b.toString();
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
