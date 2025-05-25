import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class App {
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/order_management",
                    "root",
                    ""
            );
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
