/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;
import java.util.Scanner;
/**
 *
 * @author HARSH
 */
public class eleventh {
 public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/practicle","root","");
            String query="select empnm,designation from emp where department=?";
            PreparedStatement pst=con.prepareStatement(query);
            System.out.print("department : ");
            String a=sc.next();
            pst.setString(1,a);
            ResultSet rs=pst.executeQuery();
            System.out.println("empnm\tdesignation");
            while(rs.next())
            {
                System.out.print(rs.getInt(1)+"\t");
                System.out.println(rs.getString(3)+"\t");
            
            }
        } 
        catch (Exception e) {
            System.out.println(e);
       }
    }   
}
