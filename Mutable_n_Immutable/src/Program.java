class test{
    void change(String name){
      name=name+" changed..";  
    }
    
    void modify(StringBuilder sb){
        sb.append(" Changed..");
    }
}

public class Program {

    public static void main(String[] args) {
        // TODO code application logic here
        
        String name="Aptech";
        StringBuilder sb=new StringBuilder("Aptech");
        test tt=new test();
        
        System.out.println("Before change method call..");
        System.out.println(name);
        
        tt.change(name);
        System.out.println("After change method call..");
        System.out.println(name);
        
        System.out.println("Before change method call..");
        System.out.println(sb);
        
        tt.modify(sb);
        System.out.println("After change method call..");
        System.out.println(sb);
    }
}
