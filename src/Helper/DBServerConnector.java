package Helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBServerConnector {
    private Connection connection = null;

    public Connection connectionToDB(){
        try {
            this.connection = DriverManager.getConnection("jdbc:sqlite:sample.db");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return this.connection;
    }

    public static Connection getInstance(){
        DBServerConnector dbServerConnector = new DBServerConnector();
        return dbServerConnector.connectionToDB();
    }
}
