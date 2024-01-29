package test;

import java.sql.*;

public class demo {

    private static final String url = "jdbc:mysql://localhost:3306/db";
    private static final String username = "root";
    private static final String password = "WASD@1234";

    public static void main(String[] args) {

        //connect to your ide with database using necessary connector
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // load driver
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try {
            Connection con = DriverManager.getConnection(url, username, password); // connect to database


/*
            Statement stmt = con.createStatement();  // create statement object to execute query on database connection
            String query1 = "SELECT * FROM Students"; // query
            String query2 = String.format("Insert into Students  (id, name, marks) values (%d, '%s', %d)", 3, "Monika",
                    60); // query
*/
            String query1 = "SELECT * FROM Students where id = ?"; // query
            String query2 = "Insert into Students  (id, name, marks) values (?, ?, ?)";
            PreparedStatement stmt2 = con.prepareStatement(query2);
            stmt2.setInt(1, 4);
            stmt2.setString(2, "Monika");
            stmt2.setInt(3, 60);

            ResultSet rs = stmt2.executeQuery(); // execute query
            if (rs.next()) {

                double marks = rs.getDouble("marks");
                System.out.println("Marks: " + marks);
            }else {
                System.out.println("No data found");
            }



//            int rowsAffected = stmt2.executeUpdate(query1); // execute query
            int rowsAffected = stmt2.executeUpdate(); // execute query

            if (rowsAffected > 0) {
                System.out.println("Inserted");
            } else {
                System.out.println("Not Inserted");
            }
/*
 ResultSet rs = stmt2.executeQuery(query1); // execute query

 while (rs.next()) {
     int id = rs.getInt("id");
     String name = rs.getString("name");
     int marks = rs.getInt("marks");
     System.out.println(id + " " + name + " " + marks);

 }
*/


            con.close(); // close connection
        } catch (SQLException e) {
            System.out.println(e.getMessage());

        }


    }
}
