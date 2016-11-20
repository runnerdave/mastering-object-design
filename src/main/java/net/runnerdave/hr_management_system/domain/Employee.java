package net.runnerdave.hr_management_system.domain;

import java.time.LocalDate;

/**
 * Created by davidajimenez on 20/11/2016.
 */
public class Employee {
    private String name;
    private LocalDate hireDate;
    private int salary;
    private int employeeID;
    private boolean working = false;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public boolean isWorking() {
        return working;
    }

    public void setWorking(boolean working) {
        this.working = working;
    }

    public static int getCOUNTER() {
        return COUNTER;
    }

    public static void setCOUNTER(int COUNTER) {
        Employee.COUNTER = COUNTER;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", hireDate=" + hireDate +
                ", salary=" + salary +
                ", employeeID=" + employeeID +
                ", working=" + working +
                '}';
    }

    private static int COUNTER;

    public Employee(String name, LocalDate hireDate, int salary, boolean working) {
        this.name = name;
        this.hireDate = hireDate;
        this.salary = salary;
        this.employeeID = ++COUNTER;
        this.working = working;
    }
}
