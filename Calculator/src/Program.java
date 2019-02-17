import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        
        System.out.print("Enter first number :");
            int a=sc.nextInt();
            System.out.print("Enter second number :");
            int b=sc.nextInt();
        
         
        while(true){
            System.out.println("\n1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division ");
             System.out.println("5. Exit\n");
           
            System.out.print("Enter Option :");
            int option=sc.nextInt();
            
              switch(option){
                  case 1: System.out.printf( "%d+%d=%d",a,b,a+b );break;
                  case 2: System.out.printf( "%d-%d=%d",a,b,a-b );break;
                  case 3: System.out.printf( "%dx%d=%d",a,b,a*b );break;
                  case 4 :System.out.printf (" d/%d=%d",a,b,a/b );break;
                  case 5: return;
                  default : System.out.println("You have entered a wrong choice!!");
              }
          }
  }
    
}
