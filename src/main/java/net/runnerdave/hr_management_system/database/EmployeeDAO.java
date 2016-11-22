package net.runnerdave.hr_management_system.database;

import net.runnerdave.hr_management_system.domain.Employee;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by davidajimenez on 20/11/2016.
 */
public class EmployeeDAO {

    Employee emp1 = new Employee("Mike", LocalDate.now(), 5000, false);
    Employee emp2 = new Employee("Steve", LocalDate.now(), 7000, false);
    Employee emp3 = new Employee("John", LocalDate.now(), 4500, false);
    Employee emp4 = new Employee("Pat", LocalDate.now(), 6000, false);
    Employee emp5 = new Employee("Joe", LocalDate.now(), 8000, false);

    private Map<Integer, Employee> employees;

    public Map<Integer, Employee> generateEmployees(){
        employees = new HashMap<>();
        employees.put(emp1.getEmployeeID(), emp1);
        employees.put(emp2.getEmployeeID(), emp2);
        employees.put(emp3.getEmployeeID(), emp3);
        employees.put(emp4.getEmployeeID(), emp4);
        employees.put(emp5.getEmployeeID(), emp5);
        return employees;
    }

    public void addEmployee(Employee emp) {
        employees.put(emp.getEmployeeID(), emp);
    }

    public void removeEmployee(Employee emp) {
        employees.remove(emp.getEmployeeID());
    }

    public Map<Integer, Employee> getEmployees() {
        return employees;
    }

    public Employee getEmployeeByID(int empID) {
        Employee emp = employees.get(empID);
        return emp;
    }
}
