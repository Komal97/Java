import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        // TODO code application logic here
      Scanner sc=new Scanner(System.in);
        
        while(true){
        System.out.println("\n1. Write Data");
        System.out.println("2. Read Data");
        System.out.println("3. Exit");
        System.out.print("Enter Your Choice : ");
        int choice=sc.nextInt();
        
         switch(choice){
             case 1 : WriteChar();
                      break;
             case 2 : ReadChar();
                      break;
             case 3 : return;
             default : System.err.println("You entered wrong choice..");
                       break;
         }
        }
       
    }
    
    static void ReadChar(){
         try(FileReader fr=new FileReader("E:\\MyFile.txt")){
            int ch;
            while((ch=fr.read())!=-1){
                System.out.print((char)ch);
            }
        }
        
        catch(Exception ex){
            System.out.println("Error : "+ex.getMessage());
        }
    }
    
    
    static void WriteChar(){
      
        try(FileWriter fw=new FileWriter("E:\\MyFile.txt",true)){
            fw.write("\n This is my first file");
            fw.write("\n This is First Line");
        }
        
        catch(Exception ex){
            System.out.println("Error : "+ex.getMessage());
        }  
    }
}
