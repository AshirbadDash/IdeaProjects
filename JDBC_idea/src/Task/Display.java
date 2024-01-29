package Task;

import java.sql.*;

public class Display {
    public static void display() throws ClassNotFoundException, SQLException {


        // loading the driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://localhost/kodnest";
        String userName = "root";
        String Password = "WASD@1234";

        Connection con = DriverManager.getConnection(url, userName, Password);


        // Prepare the SQL statement
        String sql = "select * from student";

        // Create a Statement object
        Statement stmt = con.createStatement();

        // Execute the statement
        ResultSet set=stmt.executeQuery(sql);

        while(set.next()){
            System.out.println(set.getInt(1)+" "+set.getString(2));
        }




        con.close();
    }

}

