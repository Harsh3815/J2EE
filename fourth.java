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
public class fourth {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practicle", "root", "");
            String query = "select * from emp where (city) like 'rajkot'";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            
            System.out.println("empno\tempnm\tdesignation\tcity\tsalary\tdepartment");

            while (rs.next()) {
                System.out.print(rs.getInt(1) + "\t");
                System.out.print(rs.getString(2) + "\t");
                System.out.print(rs.getString(3) + "\t");
                System.out.print(rs.getString(4) + "\t");
                System.out.print(rs.getInt(5) + "\t");
                System.out.println(rs.getString(6));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
