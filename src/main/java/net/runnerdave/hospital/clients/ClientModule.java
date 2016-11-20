package net.runnerdave.hospital.clients;

import net.runnerdave.hospital.actors.HospitalManager;
import net.runnerdave.hospital.domain.Doctor;
import net.runnerdave.hospital.domain.Employee;
import net.runnerdave.hospital.domain.Nurse;
import net.runnerdave.hospital.domain.dao.EmployeeDAO;
import net.runnerdave.hospital.reporting.EmployeeReportFormatter;
import net.runnerdave.hospital.reporting.FormatType;

/**
 * Client Module
 */
public class ClientModule {
    static EmployeeDAO employeeDAO = new EmployeeDAO();

    public static void main(String[] args) throws InterruptedException {

        System.out.println("== Welcome to the Hospital Manager System ==");
        System.out.println("\n\n== Hiring staff ==");
        Employee employee1 = new Doctor(1l, "Pedro", "emergency", false);
        hireNewEmployee(employee1);
        Thread.sleep(2000);

        printEmployeeReport(employee1, FormatType.CSV);
        Employee employee2 = new Nurse(2, "Peggy", "emergency", false);
        hireNewEmployee(employee2);

        Thread.sleep(2000);

        System.out.println("\n\n== Perform duties ==");
        HospitalManager ERDirector = new HospitalManager();
        ERDirector.callUpon(employee2);
        ERDirector.callUpon(employee1);

        Thread.sleep(2000);

        System.out.println("\n\n== Print employee reports ==");
        printEmployeeReport(employee1, FormatType.CSV);
        printEmployeeReport(employee2, FormatType.XML);

        Thread.sleep(2000);

        System.out.println("\n\n== Terminate staff ==");
        terminateEmployee(employee1);
    }

    static void hireNewEmployee(Employee emp) {
        emp.setWorking(true);
        employeeDAO.saveEmployee(emp);
    }

    static void terminateEmployee(Employee emp) {
        emp.setWorking(false);
        employeeDAO.deleteEmployee(emp);
    }

    static void printEmployeeReport(Employee emp, FormatType format) {
        EmployeeReportFormatter formatter = new EmployeeReportFormatter(emp, format);
        System.out.println(formatter.getFormattedOutput());
    }


}
