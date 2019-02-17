import java.util.Scanner;

 class Array {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int a[][]=new int[4][4];
         int i,j,sum=0; 
       
        System.out.println("Enter Elements In The Array : ");
        for(i=0;i<4;i++){
            for(j=0;j<4;j++){
                a[i][j]=sc.nextInt();
            }
             System.out.println();  
        }
         
                                              
            for(i=0;i<4;i++){
              for(j=0;j<4;j++){
                   sum=sum+a[i][i];
                   }
                 System.out.println("Sum of rows "+i+" : "+sum);
                 sum=0;
          }
     }
}
