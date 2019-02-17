import com.aptech.delhi.program.Third;
import pack.Second;

class Test extends Second{
    void UseMe()
    { protectedfun();
    }
}
class Program {
    public static void main(String[] args) {
       Second ss=new Second();
       ss.publicfun();
       Test t1=new Test();
       t1.UseMe();
       Third tt=new Third();
    }
    
}
