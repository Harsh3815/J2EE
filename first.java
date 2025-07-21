/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package first;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author HARSH
 */
public class first {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/practicle","root","");
 //         String query1="insert into emp(empno,empnm,designation,city,salary,department) values(1,'utsav','Developer','Vaghaniya',50000,'Python Developer')";
 //         String query2="insert into emp(empno,empnm,designation,city,salary,department) values(2,'Harsh','Developer','amreli',45000,'java Developer')";
 //         String query3="insert into emp(empno,empnm,designation,city,salary,department) values(3,'meet','Manager','Liliya',85000,'Python Developer')";
 //         String query4="insert into emp(empno,empnm,designation,city,salary,department) values(4,'kishan','Manager','Vaghaniya',30000,'Mechanical enginner')";
 //         String query5="insert into emp(empno,empnm,designation,city,salary,department) values(5,'harsil','Developer','Amrapur',40000,'Net Devloper')";
 //         String query6="insert into emp(empno,empnm,designation,city,salary,department) values(6,'vansh','Developer','rajkot',60000,'selling')";

           String u="update emp  set empnm='aarav' where empno=2";
            Statement st=con.createStatement();
            st.executeUpdate(u);        

            System.out.println("Record inserted successfully");
        } 
        catch (Exception e) {
            System.out.println(e);
       }
    }
    
}
