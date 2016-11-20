package net.runnerdave.hospital.domain.dao;

import net.runnerdave.hospital.database.DatabaseConnectionManager;
import net.runnerdave.hospital.domain.Employee;

/**
 * Created by davidajimenez on 19/11/2016.
 */
public class EmployeeDAO {
    DatabaseConnectionManager connectionManager = DatabaseConnectionManager.getConnectionObject();

    public void saveEmployee(Employee emp){
        connectionManager.connect();
        System.out.println(emp + " saved to db");
        connectionManager.disconnect();
    }

    public void deleteEmployee(Employee emp) {
        connectionManager.connect();
        System.out.println(emp + " deleted from db");
        connectionManager.disconnect();
    }
}
