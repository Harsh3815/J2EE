/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 *
 * @author HARSH
 */
public class thirteen {
   public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practicle", "root", "");
            String query = "UPDATE stud SET firstname = ? WHERE rollno = ?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, "harsh"); 
            pst.setInt(2, 2);
            pst.executeUpdate();
            System.out.println("Record Update successfully!");

        } catch (Exception e) {
            System.out.println("Error in record update: " + e);
        }
    } 
}
