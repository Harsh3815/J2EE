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
public class sixteen {
  public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/practicle","root","");
            String query="{CALL insert_with(?,?,?,?,?)}";
            CallableStatement cst=con.prepareCall(query);
            System.out.print("name : ");
            String a=sc.next();
            cst.setString(1,a);
            System.out.print(" designation : ");
            String b=sc.next();
            cst.setString(2,b);
            System.out.print("city : ");
            String c=sc.next();
            cst.setString(3,c);
            System.out.print("salary : ");
            int d=sc.nextInt();
            cst.setInt(4,d);
            System.out.print("department : ");
            String e=sc.next();                
            cst.setString(5,e);
            cst.executeUpdate();
        } 
        catch (Exception e) {
            System.out.println(e);
       }
    }  
}
