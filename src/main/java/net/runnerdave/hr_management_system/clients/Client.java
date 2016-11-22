package net.runnerdave.hr_management_system.clients;

import net.runnerdave.hr_management_system.database.EmployeeDAO;
import net.runnerdave.hr_management_system.domain.Employee;
import net.runnerdave.hr_management_system.subjects.EmployeeManagementSystem;
import net.runnerdave.hr_management_system.observers.HRDepartment;
import net.runnerdave.hr_management_system.observers.IObserver;
import net.runnerdave.hr_management_system.observers.PayrollDepartment;

import java.time.LocalDate;

/**
 * Created by davidajimenez on 20/11/2016.
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("== Welcome to the HR management system ==");

        EmployeeDAO employeeDAO = new EmployeeDAO();
        employeeDAO.generateEmployees();
        EmployeeManagementSystem ems = new EmployeeManagementSystem(employeeDAO);
        IObserver hr = new HRDepartment(ems);
        IObserver payroll = new PayrollDepartment(ems);

        Employee bob = new Employee("Bob", LocalDate.now(),5000,true);

        ems.hireNewEmployee(bob);

        System.out.println("== Report after hiring new employee");

        hr.produceEmployeeReport();

        ems.fireEmployee(1);

        System.out.println("== Report after firing employee 1");

        payroll.produceEmployeeReport();

        ems.modifyEmployeeName(2, "Juan");

        System.out.println("== Report after changing employee name");

        System.out.println(ems.produceEmployeeReport());

    }
}
