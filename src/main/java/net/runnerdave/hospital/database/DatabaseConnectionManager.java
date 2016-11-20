package net.runnerdave.hospital.database;

/**
 * Created by davidajimenez on 19/11/2016.
 */
public class DatabaseConnectionManager {
    private static final DatabaseConnectionManager instance = new DatabaseConnectionManager();
    private DatabaseConnectionManager(){};
    public static DatabaseConnectionManager getConnectionObject() {
        return instance;
    }

    public void connect(){
        System.out.println("Database connected successfully!");
    }

    public void disconnect(){
        System.out.println("Database connection closed");
    }
}
