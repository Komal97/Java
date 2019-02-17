
public class Student {

    private int rollno;
    private String name;
    private String city;
    private int marks;
    
    public Student(){
        System.out.println("Default Object Created...");
    }
    
    public Student(int rollno,String name,String city,int marks){
        System.out.println("Parameterized Constructor called...");
    }
    
    //only public methods can be invoked...
    
    public void display(){
        System.out.println("Display method invoked...");
    }
    
    public void calcgrade(){
        System.out.println("Calculate Grade method invoked...");
    }
    
    public void PrintMe(String name){
        System.out.println("Welcome "+name);
    }
    
    public void sum(int a,int b){
        return a+b;
    }
}
