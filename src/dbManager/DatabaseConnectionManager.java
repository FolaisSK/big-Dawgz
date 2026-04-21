package dbManager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionManager {
    public static Connection connectToDatabase(String url, String username, String password) throws SQLException {
        return DriverManager.getConnection(url, username, password);
    }
}
