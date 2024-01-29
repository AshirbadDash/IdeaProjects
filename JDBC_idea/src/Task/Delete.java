package Task;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Delete {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // loading the driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://localhost/kodnest";
        String userName = "root";
        String Password = "WASD@1234";

        Connection con = DriverManager.getConnection(url, userName, Password);
        System.out.println(con + " connected sucessfully");

        // Prepare the SQL statement
        String sql = "DELETE FROM student WHERE id = ?";
        PreparedStatement pstmt = con.prepareStatement(sql);

        // Get user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student ID to delete:");
        int id = scanner.nextInt();

        // Set the values
        pstmt.setInt(1, id);

        // Execute the statement
        int count = pstmt.executeUpdate();

        if(count == 0)
            System.out.println("No record found");
        else if(count == 1)
            System.out.println("Record deleted successfully");
        else // count > 1 (multiple records deleted

        System.out.println(count + " record(s) deleted");

        con.close();
    }
}
