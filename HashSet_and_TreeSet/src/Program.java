import java.util.*;

public class Program {
    public static void main(String[] args) {
        /* ArrayList list=new ArrayList();
        list.add(2);
        list.add("Komal");
        list.add(34.5f);
        list.add('a');  */
       
       //for loop is not used in HashSet and TreeSet
       //it works on elements 
       
       //HashSet<Integer> list=new HashSet<>();
       
       Set<Integer> list=new TreeSet<>();
       list.add(3);
       list.add(2);
       list.add(1);
       list.add(5);
       list.add(2);
       
        
        System.out.println("Display list using ArrayList Variable...");
        System.out.println(list);
         System.out.println("-----------------------------------------");
        
        System.out.println("Display List using Advance Loop...");
        for(int obj:list)
        System.out.println(obj);
           System.out.println("-----------------------------------------");
      
           
       System.out.println("Display List after Removing...");
         list.remove(2);
         list.remove(1);
        
       System.out.println(list);
       System.out.println("-----------------------------------------");
       for(int obj:list)
        System.out.println(obj);
       System.out.println("-----------------------------------------");   
    }
}
        
    
    

