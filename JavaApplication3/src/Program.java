import java.util.Scanner;             //this program requires correction

class employee{
    private int empid;
    private String name;
    
    employee(){                                   
        empid=0;
        name="Nothing"
    }
    
     public void output(){
         System.out.println("Employee Id :"+empid);
         System.out.println("Employee Name :"+name);
     
      
    } 
}

class Program {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Employee Id : ");
        int empid=sc.nextInt();
        System.out.print("Enter Employee Name : ");
        sc.nextLine();
        String name=sc.nextLine();
        
       employee emp=new employee();
       emp.output();
      }
    
}
