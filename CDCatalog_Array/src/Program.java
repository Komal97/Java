import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        
       Catalog c[]=new Catalog[10];
       Scanner sc=new Scanner(System.in);
       int count=0;
       
       while(true){
         System.out.println("\nSelect any one option :");
         System.out.println("----------------------");
         System.out.println("1. Add CD To The Catalog");
         System.out.println("2. Search CD By CD Title");
         System.out.println("3. Update The Catalog");
         System.out.println("4. Display The Catalog");
         System.out.println("5. EXIT");
         
         System.out.print("\nPlease Enter Your Choice : ");
         int choice=sc.nextInt();
         
         switch(choice){
            
             case 1 :
                 if(count<2){
                     System.out.print("Enter CD Collection Name(Game/Movie/Music) : ");
                     sc.nextLine();
                     String collname=sc.nextLine();
                     
                     System.out.print("Enter CD Type(Audio/Vedio) : ");
                     String type=sc.nextLine();
                     
                     System.out.print("Enter CD Title : ");
                     String title=sc.nextLine();
                     
                     System.out.print("Enter Price : ");
                     float price=sc.nextFloat();
                     
                     System.out.print("Enter CD ID : ");
                     int id=sc.nextInt();
                     
                     System.out.print("Enter Year Of Release : ");
                     int year=sc.nextInt();
                     
                     c[count]=new Catalog(collname,type,title,price,id,year);
                     System.out.println("Record added..!!");
                     System.out.println("----------------");
                     count++;
                 }
                 else{
                    System.out.println("Unable To Add CD..!!");
                    System.out.println("----------------");
                 }
                 break;
                 
             case 2 :
                 System.out.print("Enter CD Title to be searched : ");
                 sc.nextLine();
                 String ttl=sc.nextLine();
                 
               boolean found=false;
                 for(int i=0;i<count;i++){
                     if(ttl.equalsIgnoreCase(c[i].getTitle())){
                       found = true;
                         System.out.println("CD Collection Name : "+c[i].getCollname());
                         System.out.println("CD Type : "+c[i].getType());
                         System.out.println("CD Title : "+c[i].getTitle());
                         System.out.println("Price : "+c[i].getPrice());
                         System.out.println("CD ID : "+c[i].getId());
                         System.out.println("Year Of Release : "+c[i].getYear());
                     
                     }
                 if(!found)
                     System.out.println("Record not found..!!");
                 
                 }
                   break;
                   
             case 3 :
                 System.out.print("Enter CD to be Updated : ");
                 sc.nextLine();
                 ttl=sc.nextLine();
                 found=false;
                  for(int i=0;i<count;i++){
                     if(ttl.equalsIgnoreCase(c[i].getTitle())){
                       found = true;
                        
                     System.out.print("Enter new CD Collection Name(Game/Movie/Music) : ");
                     String collname=sc.nextLine();
                     
                     System.out.print("Enter new CD Type(Audio/Vedio) : ");
                     String type=sc.nextLine();
                     
                     System.out.print("Enter new CD Title : ");
                     String title=sc.nextLine();
                     
                     System.out.print("Enter new Price : ");
                     float price=sc.nextFloat();
                     
                     System.out.print("Enter new CD ID : ");
                     int id=sc.nextInt();
                     
                     System.out.print("Enter new Year Of Release : ");
                     int year=sc.nextInt();
                     
                     c[i].setCollname(collname);
                     c[i].setType(type);
                     c[i].setTitle(title);
                     c[i].setPrice(price);
                     c[i].setId(id);
                     c[i].setYear(year);
                     System.out.println("Record updated...!!!");
                    
                  }  
                   if(!found)
                    System.out.println("Record does not exist...!!!");
                  }
                    break;
                     
             case 4 :
                 for(int i=0;i<count;i++){
                 //System.out.println(i+1+".");
                 System.out.println(c[i]);
                 }
                 break;
                 
             case 5 :
                 return;
                 
             default :
                 System.out.println("Invalid Choice..!!");
         }
       }
    }
}
