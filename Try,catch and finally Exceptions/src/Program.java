import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
        
        try{
            /*System.out.print("Enter first number : ");
            int a=sc.nextInt();
            System.out.print("Enter second number : ");
            int b=sc.nextInt();*/
            
            int a= Integer.parseInt(args[0]);
            int b= Integer.parseInt(args[1]);
            
            float d=(float)a/b;
            System.out.print("Result of Division : "+d);
          }

       catch(ArrayIndexOutOfBoundsException ex)
        { System.err.println("Error : You Forget To Enter Some Value...");
        }
        
        catch(ArithmeticException ex)
         { System.err.println("Error : Cannot divide a number by zero...");
         }
        
         catch(NumberFormatException  ex)
        {System.err.println("Error : Plz enter numeric Values...");
        } 
       
      //  catch(InputMismatchException ex)
      //  { System.out.println("Error : Plz enter numeric values...");
      //  }
        
       /*catch(Exception ex){
           System.out.println(" Error : "+ex.getMessage());
       }
       
       System.out.println();
        finally{
            System.out.println("\n\n **** End Of Program ****");
        }*/
   }
}
    

