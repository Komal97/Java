

public class Program {
    public static void main(String[] args) {
        // TODO code application logic here
        
        Thread t1=new Thread(new Runnable(){
         public void run(){
             for(int i=1;i<=5;i++){
                 System.out.println("First Thread Running");
                 try{
                   Thread.sleep(500);
                 }
                 catch(Exception ex){
                     System.out.println("Error:"+ex.getMessage());
                 }
             }
         }    
        
       });
        
        Thread t2=new Thread(new Runnable(){
         public void run(){
             for(int i=1;i<=5;i++){
                 System.out.println("Second Thread Running");
                 try{
                   Thread.sleep(500);
                 }
                 catch(Exception ex){
                     System.out.println("Error:"+ex.getMessage());
                 }
             }
         }    
        
       });
        
        
        Thread t3=new Thread(new Runnable(){
         public void run(){
             for(int i=1;i<=5;i++){
                 System.out.println("Third Thread Running");
                 try{
                   Thread.sleep(500);
                 }
                 catch(Exception ex){
                     System.out.println("Error:"+ex.getMessage());
                 }
             }
         }    
        
       });
        
        t1.start();
        t2.start();
        t3.start();
    }
    
}
