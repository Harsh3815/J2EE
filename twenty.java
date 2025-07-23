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
public class twenty {
    public static void main(String[] args){
    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practicle","root","");
        DatabaseMetaData dm = con.getMetaData();
        System.out.println("Driver name:"+dm.getDriverName());
        System.out.println("Driver Version:"+dm.getDriverVersion());
        System.out.println("DatabaseProductVersion:"+dm.getDatabaseProductVersion());
        System.out.println("Database Product Version:" + dm.getDatabaseProductVersion());
        System.out.println("url:"+dm.getURL());
        System.out.println("User Name: " + dm.getUserName());
        System.out.print("connected successfull");
    }
    catch(Exception e)
    {
        System.out.print("error in connection"+e);
    }
    }
    
}
