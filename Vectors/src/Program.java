import java.util.Vector;

public class Program {
    public static void main(String[] args) {
        /* ArrayList list=new ArrayList();
        list.add(2);
        list.add("Komal");
        list.add(34.5f);
        list.add('a');  */
       
       Vector<Integer> list=new Vector<>();
       list.addElement(2);
       list.addElement(3);
       list.addElement(4);
       list.addElement(5);
       
        
        System.out.println("Display list using ArrayList Variable...");
        System.out.println(list);
         System.out.println("-----------------------------------------");
        
        System.out.println("Display List using Advance Loop...");
        for(int obj:list)
        System.out.println(obj);
           System.out.println("-----------------------------------------");
        
        System.out.println("Display List using for-loop...");
        for(int i=0;i<list.size();i++)
            System.out.println(list.get(i));
        System.out.println("-----------------------------------------");
           
       System.out.println("Display List after Removing...");
         list.remove(2);
        
       System.out.println(list);
       System.out.println("-----------------------------------------");
       for(int obj:list)
        System.out.println(obj);
       System.out.println("-----------------------------------------");
       for(int i=0;i<list.size();i++)
            System.out.println(list.get(i));
        System.out.println("-----------------------------------------");
       
        
    }
}
       
    
    

