import java.util.ArrayList;
class Program {
    public static void main(String[] args) {
        
       /* ArrayList list=new ArrayList();
        list.add(2);
        list.add("Komal");
        list.add(34.5f);
        list.add('a');  */
       
       ArrayList<Integer> list=new ArrayList<>();
       list.add(2);
       list.add(3);
       list.add(4);
       list.add(5);
       
        
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
