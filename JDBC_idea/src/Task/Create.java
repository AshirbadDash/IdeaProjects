package Task;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Create {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {


        // loading the driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://localhost/kodnest";
        String userName = "root";
        String Password = "WASD@1234";

        Connection con = DriverManager.getConnection(url, userName, Password);
        System.out.println(con + " connected sucessfully");

        // Prepare the SQL statement
        String sql = "  CREATE TABLE IF NOT EXISTS student (id INT, name VARCHAR(255))";

        // Create a Statement object
        Statement stmt = con.createStatement();

        // Execute the statement
        stmt.execute(sql);

        System.out.println("Table created successfully");

        con.close();
    }
}
