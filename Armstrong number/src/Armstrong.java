import java.util.Scanner;

public class Armstrong {
  public static void main(String[] args) {
      
      int s,m,r,x;
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      
      s=0;
      m=n;
      while(n!=0){
          r=n%10;
          x=(r*r*r);
          s=s+x;
          n=n/10;
      }
      
          if(s==m)
              System.out.println("Armstrong");
           else
              System.out.println("Not Armstrong !!");
          
      
       
    }
    
}
