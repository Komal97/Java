import java.util.Scanner;
class Parent{
    private String name;
    
    Parent(){
        System.out.println(" Object Of Parent Class is Created....");
    }
    
    Parent(String name){
        this.name=name;
        System.out.println("Parent Object Created With Name : "+name);
    }
    
    void fun(){
        System.out.println("Fun method of Parent Class....");
    }
}

class Child extends Parent{
   private String name;
    Child(){
        System.out.println("Object Of Child Class Is Created....");
    }
    
    Child(String name){
        super(name);
        this.name=name;
        System.out.println("Child Object Created With Name : "+name);
    }
    
    void fun(){
        System.out.println("Fun Method Of Child Class.....");
        super.fun();
    }
    
   /*   void Test(){
       super.fun();
    }*/
}

public class Program {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter Name Of Object : ");
       // sc.nextLine();
        String name=sc.nextLine();
       Child cc=new Child(name);
       cc.fun();
   //    cc.Test();
       }
    
}
