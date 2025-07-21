
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HARSH
 */
public class twelth {
  public static void main(String[] args) {
        // TODO code application logic here
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practicle", "root", "");
            String Query = "INSERT INTO stud(rollno, firstname, lastname, course, semester) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement pst = con.prepareStatement(Query);
            pst.setInt(1,6);
            pst.setString(2, "harsh");
            pst.setString(3, "soni");
            pst.setString(4, "bca");
            pst.setInt(5, 1);
            pst.executeUpdate();
            System.out.println("Record inserted successfully!");
        }
        catch (Exception e) {
            System.out.println("error in insert record"+e);
       }
}
}