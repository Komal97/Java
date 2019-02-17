class PrintList{
   public void PrintMe(String name){
       for(int i=1;i<=5;i++){
           System.out.println(name+" Thread Running.."+i);
       }
   } 
}

class Program {
    public static void main(String[] args) {
      
        PrintList pl=new PrintList();
        
        Thread t1=new Thread(new Runnable(){
            public void run(){
                synchronized(pl){
                    pl.PrintMe("First");
                }
            }
        });
        
        Thread t2=new Thread(new Runnable(){
            public void run(){
                synchronized(pl){
                    pl.PrintMe("Second");
                }
            }
        });
        
        Thread t3=new Thread(new Runnable(){
            public void run(){
                synchronized(pl){
                    pl.PrintMe("Third");
                }
            }
        });
        
        t1.start();
        t2.start();
        t3.start();
        
        //it is put in try catch block bcoz here it throws InterruptedExeception
        try{   
        t1.join();
        t2.join();
        t3.join();
        }
        
        catch(Exception ex){
            System.out.println("Error : "+ex.getMessage());
        }
    }
    
}
