public class Program {
    public static void main(String[] args){
        Thread t1=new Thread(()->{
           // System.out.println("Thread running..");
            
            for(int i=1;i<=10;i++){
                System.out.println("Thread 1 Running.."+i);
                
                try{
                  Thread.sleep(100);  
                }
                catch(Exception ex){
                    System.err.println("Error : "+ex.getMessage());
                }
            }
        });
        
        Thread t2=new Thread(()->{
       //     System.out.println("Thread running..");
            
            for(int i=1;i<=10;i++){
                System.out.println("Thread 2 Running.."+i);
                
                try{
                  Thread.sleep(100);  
                }
                catch(Exception ex){
                    System.err.println("Error : "+ex.getMessage());
                }
            }
        });
        
        t1.start();
        t2.start();
    }
}

