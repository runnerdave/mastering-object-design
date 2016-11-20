package net.runnerdave.hospital.domain;

/**
 * Created by davidajimenez on 19/11/2016.
 */
public abstract class Employee {
    public long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", working=" + working +
                ", role=" + this.getClass() +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Employee(long id, String name, String department, boolean working) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.working = working;
    }

    public boolean isWorking() {
        return working;

    }

    public void setWorking(boolean working) {
        this.working = working;
    }

    public void setId(long id) {
        this.id = id;
    }

    public abstract void performDuties();

    private long id;
    private String name;
    private String department;
    private boolean working;

}
