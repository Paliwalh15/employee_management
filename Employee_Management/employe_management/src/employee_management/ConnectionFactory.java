package employee_management;
import com.mysql.jdbc.Driver;
import java.sql.*;

public class ConnectionFactory {
	public static final String URL = "jdbc:mysql://localhost:3306/emp_management";
	public static final String USER = "root";
	public static final String PASS = "";

	//Establish connection with database
	public static Connection getConnection() {
	    try {
	        DriverManager.registerDriver(new Driver());
	        return DriverManager.getConnection(URL, USER, PASS);
	    } catch (SQLException ex) {
	        throw new RuntimeException("Error connecting to the database", ex);
	    }
	}
}
