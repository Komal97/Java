import java.io.FileInputStream;
import java.io.FileOutputStream;             
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        // TODO code application logic here
        
        //here these are put in try catch block bcoz it throws exception of "file not found"
         
        Scanner sc=new Scanner(System.in);
        
        while(true){
        System.out.println("\n1. Write Data");
        System.out.println("2. Read Data");
        System.out.println("3. Copy Data");
        System.out.println("4. Exit");
        System.out.print("Enter Your Choice : ");
        int choice=sc.nextInt();
        
         switch(choice){
             case 1 : WriteData();
                      break;
             case 2 : ReadData();
                      break;
             case 3 : CopyData();
                      break;
             case 4 : return;
             default : System.err.println("You entered wrong choice..");
                       break;
         }
        }
    }
     
    static void CopyData(){
        try{
         //  FileInputStream fis =new FileInputStream("E:\\SOFTWARES\\winzip19-new.exe");
         //  FileOutputStream fos=new FileOutputStream("E:\\winzip19-new.exe");
         
         
         //  FileInputStream fis =new FileInputStream("E:\\ASSIGNMENTS\\TestData.txt");
         //  FileOutputStream fos=new FileOutputStream("E:\\TestData.txt");
           
           FileInputStream fis =new FileInputStream("E:\\ASSIGNMENTS\\S.K. BANSAL\\Blank 16A.xls");
           FileOutputStream fos=new FileOutputStream("E:\\BLANK 16A.xls");
           int data;
           while((data=fis.read())!=-1){
               fos.write(data);
           }
           fos.close();
            System.out.println("Operation done..");
        }
        
        catch(Exception ex){
            System.out.println("Error :"+ex.getMessage());
        }
    }
    
    
    
    static void WriteData(){
        try(FileOutputStream fos=new FileOutputStream("E:\\ASSIGNMENTS\\TestData.txt")){
            String str="This is my new line";
            fos.write(str.getBytes());          //write data extracting it in bytes
            System.out.println("Done...");
        }
        
        catch(Exception ex){
            System.out.println("Error :"+ex.getMessage());
        }
    }
     
    
    static void ReadData(){
        try{
            FileInputStream fis=new FileInputStream("E:\\ASSIGNMENTS\\TestData.txt");
            int data;
            
            while((data=fis.read())!=-1){                //read data till end of file
                System.out.print((char)data);          //converting data from int to char
            }
        }
        
        catch(Exception ex){
            System.err.println("Error :"+ex.getMessage());
        }
    }
}
