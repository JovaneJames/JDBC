import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectToDatabase {

    private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/name?useSSL=false";

    private final String USER = "USER";
    private final String PASS = "PASS";

    private Connection connection;

    public ConnectToDatabase() throws ClassNotFoundException, SQLException {
        Class.forName(JDBC_DRIVER);
        connection = DriverManager.getConnection(DB_URL, USER, PASS);
        if (connection.isClosed())
            throw new SQLException("ERROR: CONNECTION FAILED");
        System.out.println("Database Connection Established");
    }

}
