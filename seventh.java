/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
import java.sql.*;
/**
 *
 * @author HARSH
 */
public class seventh {
  public static void main(String args[])
    {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practicle","root","");
            
            String query = "select count(*) from emp";
            Statement st = con.createStatement();
            ResultSet rset = st.executeQuery(query);
            rset.next();
            int count = rset.getInt(1);
            System.out.println("Total Employees : "+count);
        }
        catch(Exception e){
            System.err.println(e);
        }
    }  
}
