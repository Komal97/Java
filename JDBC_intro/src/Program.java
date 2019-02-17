import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Program {
    public static void main(String[] args) {
        
     String url="jdbc:mysql://localhost:3306/college";
     String userid="root";
     String pwd="javacore";
     
     try{
         Connection con=DriverManager.getConnection(url,userid,pwd);
    }
     
     catch(SQLException ex){
         System.err.println("Error : "+ex.getMessage());
     }
     
     System.out.println("Connected With MySQL");
    }  
}
