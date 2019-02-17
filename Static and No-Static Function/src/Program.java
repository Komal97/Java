class Student{
    
    void First(){
        System.out.println("First Function");
    }
    
    static void Second(){
        System.out.println("Second Static Function");
    }
}

class Program {
    
    void Test(){
       System.out.println("Test Function");
    }
    
    static void Fun(){
        System.out.println("Static Fun Function");
    }
    
public static void main(String[] args) {
    
    Student ss=new Student();
    ss.First();
    Student.Second();
    
    Fun();
    Program pp=new Program();
    pp.Test();
        
    }
 }
