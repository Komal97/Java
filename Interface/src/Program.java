interface button{
   void on();              //by default it is public abstact void on
   void off();
}

class Fan implements button{
    public void on(){
        System.out.println("Fan is on");
    }
    
    public void off(){
        System.out.println("Fan is off");
    }
}

class TubeLight implements button{
    public void on(){
        System.out.println("TubeLight is on");
    }
    public void off(){
        System.out.println("TubeLight is off");
    }
}

public class Program {
    public static void main(String[] args) {
        // TODO code application logic here
        
        Fan ff=new Fan();
        ff.on();
        ff.off();
        
        TubeLight tl=new TubeLight();
        tl.on();
        tl.off();
    }
    
}
