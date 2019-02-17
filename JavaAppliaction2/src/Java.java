import java.util.Scanner;
public class Java {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number : ");
        int n1=sc.nextInt();
        
        System.out.print("Enter second number : ");
        int n2=sc.nextInt();
        
        System.out.printf("%d+%d=%d\n",n1,n2,n1+n2);
        
    }
    
}
