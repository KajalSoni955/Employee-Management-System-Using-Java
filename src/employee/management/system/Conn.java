package employee.management.system;
//to make a conncetion with the database
//also added mysql-jdbc driver in libraries

//import java.sql.DriverManager;
import java.sql.*;
/**
 *
 * @author Kajal C Soni
 */
public class Conn {
    
     public Connection c;
     public Statement s; //sql queries are the statements
 
    public Conn(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///employee-management-system","root","");
            //c = DriverManager.getConnection("jdbc:mysql:///db name","db username","db pswrd");
            s = c.createStatement();
        }catch(Exception e) {
           System.out.println(e);
        }
    }
    
}
