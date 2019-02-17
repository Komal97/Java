import java.util.Scanner;

public class program{
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter First Number :");
        int n1=sc.nextInt();
        System.out.print("Enter Second Number :");
        int n2=sc.nextInt();
        
        int n3;
        n3=n1;
        n1=n2;
        n2=n3;
        
        System.out.printf("Numbers After Swapping : %d and %d \n",n1,n2);
        
        
    }
    
}
