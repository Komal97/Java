import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
         
        int m[][]=new int[3][3];
         int n[][]=new int[3][3];
         int p[][]=new int[3][3]; 
         int i,j;
      
        
         Scanner sc=new Scanner(System.in);
        System.out.println();
         System.out.println("*****MATRIX  A***** ");
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                System.out.print("Enter Elements : ");
                m[i][j]=sc.nextInt();
            }
        }
  
  /*       System.out.println();
        System.out.println("*****MATRIX  B***** ");
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                System.out.print("Enter Elements : ");
                n[i][j]=sc.nextInt();
            }
        }
        
        System.out.println();
        System.out.println("*****MATRIX  C***** ");
        for(i=0;i<3;i++){                                                       
            for(j=0;j<3;j++){
                p[i][j]=0;                                                         //for addition,subtraction,multiplication of two matrices A and B
                for(int k=0;k<3;k++)
                p[i][j]=p[i][j]+m[i][k]*n[i][j];
               }
            
            }
          
         System.out.println();
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                System.out.print(p[i][j]+" ");
            }
            System.out.println();
        }
 */
  
        int temp;                                                                      //interchanging of first column with third
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                if(j==0){
                    temp=m[i][j];
                    m[i][j]=m[i][j+2];
                    m[i][j+2]=temp;
                }
            }
        }
     
     System.out.println();
     System.out.println("Matrix after interchanging of Columns");
     System.out.println("-------------------------------------------");
     for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                System.out.print(m[i][j]+" ");
            }
        System.out.println();  
     }
    }
    
}
