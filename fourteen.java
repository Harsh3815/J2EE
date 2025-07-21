/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
/**
 *
 * @author HARSH
 */
public class fourteen {
   public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/practicle","root","");
            String query="delete from stud where rollno=?";
            PreparedStatement pst=con.prepareStatement(query);
            System.out.print("rollno : ");
            int a=sc.nextInt();
            pst.setInt(1,a);
            pst.executeUpdate();
             System.out.println("Record delete successfully!");
        } 
        catch (Exception e) {
            System.out.println("Error in record delete: " + e);
       }
    } 
}
