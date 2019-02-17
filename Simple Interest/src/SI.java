import java.util.Scanner;

class SI {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        float Simple_Interest;
        
        System.out.print("Enter Principle Amount : ");
        int P=sc.nextInt();
        System.out.print("Enter Rate Of Interest   : ");
        int R=sc.nextInt();
        System.out.print("Enter Time in Years      : ");
        int T=sc.nextInt();
        
        Simple_Interest=((P*R*T)/100);
        System.out.printf("\nSimple Interest : %f \n",Simple_Interest);
        
       
    }
    
}
