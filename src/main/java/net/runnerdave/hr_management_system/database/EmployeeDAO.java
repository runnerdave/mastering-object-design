package net.runnerdave.hr_management_system.database;

import net.runnerdave.hr_management_system.domain.Employee;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by davidajimenez on 20/11/2016.
 */
public class EmployeeDAO {

    Employee emp1 = new Employee("Mike", LocalDate.now(), 5000, false);
    Employee emp2 = new Employee("Steve", LocalDate.now(), 7000, false);
    Employee emp3 = new Employee("John", LocalDate.now(), 4500, false);
    Employee emp4 = new Employee("Pat", LocalDate.now(), 6000, false);
    Employee emp5 = new Employee("Joe", LocalDate.now(), 8000, false);

    List<Employee> employees;

    public List<Employee> generateEmployees(){
        employees = new ArrayList<>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);
        employees.add(emp5);
        return employees;
    }

    public void addEmployee(Employee emp) {
        employees.add(emp);
    }
}
