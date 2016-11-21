package net.runnerdave.hr_management_system.clients;

import net.runnerdave.hr_management_system.domain.Employee;
import net.runnerdave.hr_management_system.notifier.EmployeeManagementSystem;
import net.runnerdave.hr_management_system.notifier.HRDepartment;
import net.runnerdave.hr_management_system.notifier.IObserver;
import net.runnerdave.hr_management_system.notifier.PayrollDepartment;

import java.time.LocalDate;

/**
 * Created by davidajimenez on 20/11/2016.
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("== Welcome to the HR management system ==");


        EmployeeManagementSystem ems = new EmployeeManagementSystem();
        IObserver hr = new HRDepartment(ems);
        IObserver payroll = new PayrollDepartment(ems);

        ems.subscribe(hr);
        ems.subscribe(payroll);

        Employee bob = new Employee("Bob", LocalDate.now(),5000,true);


    }
}
