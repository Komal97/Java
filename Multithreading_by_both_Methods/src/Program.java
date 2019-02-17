//Multithreading by extending Thread Class defined in java.lang package
//class MyThread extends Thread{   

//Multithreading by implementing Runnable interface defined in java.lang package
class MyThread implements Runnable{
    private String name;
    private int count;
    
    MyThread(String name,int count){
        this.name=name;
        this.count=count;
    }
    
    public void run(){
        for(int i=1;i<=count;i++){
            System.out.println(name+" Thread Running.."+i);
        
       //this is put in try catch block bcoz it throws InterruptedException
        try{
           Thread.sleep(500);
        }
        catch(Exception ex){
            System.out.println("Error : "+ex.getMessage());
        }
        }
    }
}


public class Program {
    public static void main(String[] args) {
        // TODO code application logic here
        
      /*  MyThread t1=new MyThread("First",5);
          MyThread t2=new MyThread("Second",10);
          MyThread t3=new MyThread("Third",5);
      */
      
       Thread t1=new Thread(new MyThread("First",5));
       Thread t2=new Thread(new MyThread("Second",5));
       Thread t3=new Thread(new MyThread("Third",5));
        
        t1.start();                      //method defined in class Thread
        t2.start();
        t3.start();
    }
    
}
