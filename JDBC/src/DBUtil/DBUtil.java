package DBUtil;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/DM_17";
    private static final String JDBC_USERNAME = "root";
    private static final String JDBC_PASSWORD = "Happy@17";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(JDBC_URL, JDBC_USERNAME, JDBC_PASSWORD);
    }
}