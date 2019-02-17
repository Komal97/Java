import java.util.Scanner;

class Program {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int i,j;
        System.out.print("Enter number of rows : ");
        int row=sc.nextInt();
        System.out.println();
      
        int a[][]=new int[row][];
        
        for(i=0;i<a.length;i++){
            System.out.printf("Enter number of elements in %d row : ",i);
            int cols=sc.nextInt();
            a[i]=new int[cols];
            
            for(j=0;j<a[i].length;j++){
                System.out.print("Enter Value : ");
                a[i][j]=sc.nextInt();
            }
                System.out.println();
            }
        
        System.out.println("\n\nDisplaying The Array....");
        for(i=0;i<a.length;i++){
            for(j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+"\t");
            }
            
                System.out.println();
        }
    }
}
