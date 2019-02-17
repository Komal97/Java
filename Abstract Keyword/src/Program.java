import java.util.Scanner;

abstract class Account{
    public int P,R;
    public float Interest;
    abstract void intCalc();
    void AccountOpen(){
        System.out.println("\n\n Account Open With Id Proof and Photo...");
    }
}

class SavingAccount extends Account{
    void intCalc(){
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter Principle Amount : ");
        P= sc.nextInt();
        System.out.print("Enter Rate Of Interest : ");
        R=sc.nextInt();
        Interest=(float)((P*R*0.25)/100);                        //quaterly interest calculation
        System.out.printf("Calculated Interest : %f",Interest);
    }
}

class FixedDepositAccount extends Account{
    void intCalc(){
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter Principle Amount : ");
        P= sc.nextInt();
        System.out.print("Enter Rate Of Interest : ");
        R=sc.nextInt();
        Interest=(float)((P*R*0.5)/100);
        System.out.printf("Calculated Interest : %f",Interest);  //half yearly interest calculation
    }
}

public class Program {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        Account ac1=new SavingAccount();
        ac1.AccountOpen();
        ac1.intCalc();
        
        Account ac2=new FixedDepositAccount();
        ac2.AccountOpen();
        ac2.intCalc();
        }
 }
