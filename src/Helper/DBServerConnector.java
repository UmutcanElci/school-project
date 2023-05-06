package Helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBServerConnector {
    private Connection connection = null;

    public Connection connectionToDB(){//Method for Connect to DB
        try {
            this.connection = DriverManager.getConnection(Config.DB_URL,Config.DB_USERNAME,Config.DB_PASSWORD);
            System.out.println("Done");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return this.connection;
    }

    public static Connection getInstance(){//Creation of Connection Object
        DBServerConnector dbServerConnector = new DBServerConnector();
        return dbServerConnector.connectionToDB();
    }
}
