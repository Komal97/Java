import java.util.*;
public class Program {
    public static void main(String[] args) {
        
       Map<Integer,String> list=new HashMap<>();
       list.put(2,"Komal");
       list.put(3,"Chhavi");
       list.put(6,"Dhruv");
       list.put(5,"Ashima");
       list.put(2,"Reetika");
       
        //for loop is not used in Hashmap and Treemap
        //it works on keys and information is removed using keys only...
        
        System.out.println("Display list using ArrayList Variable...");
        System.out.println(list);
        System.out.println("-----------------------------------------");
        
        System.out.println("Display List using Advance Loop...");
        for(int obj:list.keySet())
        System.out.println(obj+"="+list.get(obj));
           System.out.println("-----------------------------------------");
       
           
       System.out.println("Display List after Removing...");
         list.remove(2);
         list.remove(5);
        
       System.out.println(list);
       System.out.println("-----------------------------------------");
      
       for(int obj:list.keySet())
        System.out.println(obj+"="+list.get(obj));
       System.out.println("-----------------------------------------");
    }
}
    
    

