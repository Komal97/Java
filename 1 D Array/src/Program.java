import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
       
        System.out.print("Enter The Size Of An Array :");
        int size=sc.nextInt();
        int n[]=new int[size];
        
        for(int i=0;i<n.length;i++){
            System.out.print("Enter Elements :");
            n[i]=sc.nextInt();
        }
        
     /*   System.out.println();                                                            //just to display the elements entered
        for(int i=0;i<n.length;i++){
            System.out.println("Entered Elements are : "+n[i]);
        }*/
     
     
     /*for(int i=0;i<n.length;i++){                                                     //show which entered number is odd and which is even
         if(n[i]%2==0){
             System.out.println(n[i]+" Even");
         }
             else
             System.out.println(n[i]+" Odd");
     }*/
     
   for(int i=0;i<n.length;i++){                                                            //print table of elements in the array
       for(int j=1;j<=10;j++){
           System.out.print(n[i]*j+" ");
       }
       System.out.println();
   }  
 }
}