package Database;
import java.sql.*;
public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/hotel"; 
    private static final String USER = "root";
    private static final String PASSWORD = ""; 
    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error Connecting: " + e.getMessage());
        }
        return connection;
    }
}
