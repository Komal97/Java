import java.util.Scanner;
class Student{
    private int rollno;
    private String name;
    
    Student(int rn,String nm){
        rollno=rn;
        name=nm;
    }
    
    void Display(){
        System.out.println("Roll No. :"+rollno);
        System.out.println("Name    :"+name);
    }
}

class Program {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter Roll No. :");
        int n1=sc.nextInt();
        System.out.print("Enter Name    :");
        sc.nextLine();
        String n2=sc.nextLine();
        
        Student s1=new Student(n1,n2);
        s1.Display();
        
    }
    
}
