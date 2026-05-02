import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection2 {
    public static Connection getConnection() {
        Connection con = null;
        try {
            String url = "jdbc:mysql://localhost:3306/hospital_db";
            String user = "root";
            String password = "root123";

            con = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            System.out.println("Connection Failed: " + e);
        }
        return con;
    }
}

