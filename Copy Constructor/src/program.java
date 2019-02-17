import java.util.Scanner;

class Student{
    private int rollno;
    private String name;
    
    Student(int rn,String nm){
        rollno=rn;
        name=nm;
        
    }
    
    Student(Student s){
        rollno=s.rollno;
        name=s.name;
     }
    
    void display(){
        System.out.println("Roll No."+rollno);
        System.out.println("Name   "+name);
    }
  }
        
public class program {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter roll no.: ");
        int n1=sc.nextInt();
        System.out.print("Enter name: ");
        sc.nextLine();
        String n2=sc.nextLine();
        
        Student ss=new Student(n1,n2);
        
        Student ss1=new Student(ss);
        ss1.display();
        
        Student ss2=ss;
        ss2.display();
        
        Student ss3=new Student(new Student(110,"Komal"));
        ss3.display();
        
       }
    
}
