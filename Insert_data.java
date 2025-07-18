
package insert_data;

import java.sql.*;
import java.util.Scanner;

public class Insert_data {
    
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Harshal", "root", "");
            System.out.println("Database connected successfully.");
            //To create Table     
            Statement stmt = con.createStatement();
            /*stmt.execute("CREATE TABLE emp ("+ "empno INT PRIMARY KEY, " + "empnm VARCHAR(100), " 
                                             + "designation VARCHAR(50), " + "city VARCHAR(50), "
                                             + "salary DECIMAL(10,2), " + "department VARCHAR(50)" + ")");*/
            //insert data
            String query ="INSERT INTO emp (empno, empnm, designation, city, salary, department) values (?,?,?,?,?,?)";
            
            PreparedStatement pstmt = con.prepareStatement(query);
            Scanner sc = new Scanner(System.in);
        
            System.out.print("Enter Employee Number: ");
            int empno = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Designation: ");
            String designation = sc.nextLine();
            System.out.print("Enter City: ");
            String city = sc.nextLine();
            System.out.print("Enter Salary: ");
            double salary = sc.nextDouble();
            sc.nextLine();
            System.out.print("Enter Department: ");
            String dept = sc.nextLine();

            pstmt.setInt(1, empno);
            pstmt.setString(2, name);
            pstmt.setString(3, designation);
            pstmt.setString(4, city);
            pstmt.setDouble(5,   salary);
            pstmt.setString(6, dept);

            int rows = pstmt.executeUpdate();
            System.out.println(rows + " record inserted.");
            
            } 
        catch (Exception e) 
        {
            System.out.println("Sorry: " + e);
        }
    }
    
}
