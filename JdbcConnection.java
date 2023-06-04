/*
 * Making A Connection With Database Using MySQL Driver With The Use OF JDBC Connectivity
 //DataBase Neme- demo
//Table Name -register

 */
package travel.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class JdbcConnection {

    
    public static void main(String[] args) {
        System.out.println("-------- MySQL JDBC Connection Demo ------------");
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } 
        catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found !!");
            return  ;
        }
        System.out.println("MySQL JDBC Driver Registered!");
        Connection con = null;
        try {
            con = DriverManager
                .getConnection("jdbc:mysql://127.0.0.1:3307/tms", "root", "root");
            System.out.println("SQL Connection to database established!");
 
        } catch (SQLException e) {
            System.out.println("Connection Failed! Check output console");
            return ;
        } finally {
            try
            {
                if(con != null)
                    con.close();
                System.out.println("Connection closed !!");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}