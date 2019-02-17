class Connection{
    private static Connection obj;
    
    private Connection(){
        
    }
    
    public static Connection getConnection(){            //here connection is return type
        if(obj==null){
            obj=new Connection();
            return obj;
        }
        return obj;
    } 
 }

public class Program {
    public static void main(String[] args) {
        // TODO code application logic here
        
        Connection con = Connection.getConnection();
    }
    
}
