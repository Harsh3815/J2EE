/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;
import java.util.*;
/**
 *
 * @author HARSH
 */
public class fifth {
  public static void main(String[] args){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practicle","root","");
            
            String query = "select *from emp where empnm LIKE 'A%'";
            Statement st = con.createStatement();
            ResultSet rset = st.executeQuery(query);
            while(rset.next()){
                System.out.println("Emp no : "+rset.getInt("empno"));
                System.out.println("Emp name : "+rset.getString("empnm"));
                System.out.println("Emp designation : "+rset.getString("designation"));
                System.out.println("Emp city : "+rset.getString("city"));
                System.out.println("Emp salary : "+rset.getInt("salary"));
                System.out.println("Emp department : "+rset.getString("department"));
                System.out.println();
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }  
}
