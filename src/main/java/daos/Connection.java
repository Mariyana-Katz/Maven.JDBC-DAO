package daos;

import java.sql.DriverManager;
import java.sql.SQLException;
 import com.mysql.cj.jdbc.Driver;

public class Connection {
    public static final String URL = "jdbc:mysql://localhost:3306/Car";
    public static final String USER = "testuser";
    public static final String PASS = "testpass";

    /**
     * Get a connection to database
     * @return Connection object
     */
    public static java.sql.Connection getConnection() {
        try {
            DriverManager.registerDriver(new Driver());
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (SQLException ex) {
            throw new RuntimeException("Error connecting to the database", ex);
        }
    }
}
