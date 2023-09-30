package kashi;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class m {
    public static void main(String[] args) {
        // Define connection parameters
        String url = "jdbc:mysql://localhost:3306/employee";
        String user = "root";
        String password = "Ihsak@123";

        // Define a connection object
        Connection connection = null;

        try {
            // Step 1: Register the MySQL JDBC driver
            Class.forName("com.mysql.jdbc.Driver");

            // Step 2: Establish the connection
            connection = DriverManager.getConnection(url, user, password);

            // Step 3: Create a statement
            Statement statement = connection.createStatement();

            // Step 4: Execute a query (example: selecting all records from a table)
            String sqlQuery = "SELECT * FROM empolyee_Detils";
            ResultSet resultSet = statement.executeQuery(sqlQuery);

            // Step 5: Process and display the results
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                // Add more columns as needed

                System.out.println("ID: " + id + ", Name: " + name);
            }

            // Step 6: Close the resources
            resultSet.close();
            statement.close();
        } catch (ClassNotFoundException e) {
            System.err.println("MySQL JDBC driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.err.println("Database connection error.");
            e.printStackTrace();
        } finally {
            // Close the connection in a finally block to ensure it's always closed
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}