import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
      
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int row=sc.nextInt();
        System.out.print("Enter number of columns : ");
        int col=sc.nextInt();
        
        int n[][]=new int[row][col];
        
        System.out.println();
        for(int i=0;i<n.length;i++){
            for(int j=0;j<n[i].length;j++){
                System.out.print("Enter Elements : ");
                n[i][j]=sc.nextInt();
            }
        }
        
         System.out.println();
        for(int i=0;i<n.length;i++){
            for(int j=0;j<n[i].length;j++){
                System.out.print(n[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
