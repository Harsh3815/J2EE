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
public class seventeen {
   public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/practicle","root","");
            String query="{CALL show1(?)}";
            CallableStatement cst=con.prepareCall(query);
            System.out.print("empno : ");
            int a=sc.nextInt();
            cst.setInt(1,a);
            ResultSet rst=cst.executeQuery();
            System.out.println("desiganation ");
            while(rst.next())
            {
                System.out.println(rst.getString("designation"));
            }
        } 
        catch (Exception e) {
            System.out.println(e);
       }
    } 
}
