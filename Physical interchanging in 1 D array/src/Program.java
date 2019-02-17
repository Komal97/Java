import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of an array : ");
        int size=sc.nextInt();
        int temp;
        
        int n[]=new int[size];
        
        for(int i=0;i<n.length;i++){
           System.out.print("Enter Elements : ");
           n[i]=sc.nextInt();
        }
        
        for(int i=0;i<(n.length/2);i++){
            temp=n[i];
            n[i]=n[(n.length-1)-i];
            n[(n.length-1)-i]=temp; 
        }
         
        System.out.println("\n\nElements after interchanging : ");
        for(int i=0;i<n.length;i++){
           System.out.print(n[i]+" ");
        
        }
    }
    
}
