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
public class nineteen {
    public static void main(String[] args){
    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/practicle","root","");
//CREATE 

//        String query="create table product(pid int,productname varchar(20),price int,quantity int)";
//String query1 = "insert into product(pid,productname,price,quantity) values(001,'men''s gold ring',100000,5)";
//String query2="insert into product(pid,productname,price,quantity) values(002,'women''s gold ring',10000,10)";
//String query3="insert into product(pid,productname,price,quantity)values(003,'silver chain',5000,20)";
//st.executeUpdate(query);
//System.out.println("reccord inserted");

//READ

//String query="select *from product";
//        Statement st = con.createStatement();
//        ResultSet rs = st.executeQuery(query);
/*        while(rs.next()){
            System.out.println("product id :"+rs.getInt("pid"));
            System.out.println("product name :"+rs.getString("productname"));
            System.out.println("price :"+rs.getInt("price"));
            System.out.println("quantity :"+rs.getInt("quantity"));
            System.out.println("\n");
        }*/
        
        
//UPDATE

/*        String query="update product set price=? where pid=?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setInt(1,100000);
        ps.setInt(2,002);
        ps.executeUpdate();
        System.out.println("record update successfull");*/

//DELETE

String query="delete from product where pid=003";
PreparedStatement ps = con.prepareStatement(query);
ps.executeUpdate();
 System.out.println("record delete successfull");
        }
    catch(Exception e)
    {
        System.out.println("error in record delete "+e);
    }
}
}