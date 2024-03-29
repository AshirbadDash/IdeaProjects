package Task;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.Scanner;

 class Insert{
    public static void main(String[] args) throws ClassNotFoundException, SQLException {


        // loading the driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://localhost/Kodnest";
        String userName = "root";
        String Password = "WASD@1234";

        Connection con = DriverManager.getConnection(url, userName, Password);
//        System.out.println(con + " connected sucessfully");

        // Get user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student ID:");
        int id = scanner.nextInt();
        System.out.println("Enter student name:");
        String name = scanner.next();

        // Prepare the SQL statement
        String sql = "INSERT INTO student (id, name) VALUES (?, ?)";
        PreparedStatement pstmt = con.prepareStatement(sql);


        // Set the values
        pstmt.setInt(1, id);
        pstmt.setString(2, name);

        // Execute the statement
        pstmt.executeUpdate();

        System.out.println("Record inserted successfully");
    }
}
