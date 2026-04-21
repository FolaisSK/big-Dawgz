package dbManager;

import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

public class DatabaseManagerTest {
    @Test
    void testCanConnectToDatabase(){
        try{
        final String username = "root";
        final String password = "";
        final String mysqlUrl = "jdbc:mysql://localhost:3306/bigDawgz?createDatabaseIfNotExist=true";

        Connection connection = DatabaseConnectionManager.connectToDatabase(mysqlUrl,username,password);
        assertNotNull(connection);
        assertTrue(connection.isValid(3));
        }catch (SQLException exception){
            exception.printStackTrace();
            assertNull(exception);
        }
    }
}
