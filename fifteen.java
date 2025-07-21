/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;
/**
 *
 * @author HARSH
 */
public class fifteen {
  public static void main(String[] args) {
        // TODO code application logic here
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/practicle","root","");
            String query="{CALL insert1()}";
            CallableStatement cst=con.prepareCall(query);
            cst.executeUpdate();
        } 
        catch (Exception e) {
            System.out.println(e);
       }
    }
}
