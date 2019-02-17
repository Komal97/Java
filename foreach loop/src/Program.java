
public class Program {
    public static void main(String[] args) {
        
        int nums[]={1,2,3,4,5};
       /* String names[]={"Chhavi","Komal","Ashima","Ritika"};
        
       for(int n:nums){                                           //to display all elements of array using foreach loop
            System.out.println(n);
        }
        
        for(String nm:names){
            System.out.println(nm);
        }*/
       
      
       
       /* int sum=0;                                     //to find sum
       for(int n:nums){
           sum=sum+n;
       }
       System.out.println(sum);
       */
      
     
       int ecount=0,ocount=0;                    //to count even and odd numbers
      
      for(int n:nums){
          if(n%2==0){
             ecount++;
          }
          else
              ocount++;
      }
      System.out.println("Even no. :"+ecount);
      System.out.println("Odd no. :"+ocount);
      
    }
    
}
