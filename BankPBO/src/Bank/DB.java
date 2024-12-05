package Bank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Hafiz
 */
public class DB {

    private static final String URL = "jdbc:mysql://localhost:3306/atm";
    private static final String URLTeller = "jdbc:mysql://localhost:3306/teller";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    private static Connection connection;

    public Connection buatConnection() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connected to the database successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.err.println("JDBC Driver not found.");
            e.printStackTrace();
        }
        return connection;
    }
}
