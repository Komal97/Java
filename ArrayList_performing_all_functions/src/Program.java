import java.util.*;

public class Program {
    public static void main(String[] args) { 
    
     Scanner sc=new Scanner(System.in);
   
     ArrayList<Student> list=new ArrayList<>();
     
     list.add(new Student(1,"Komal","New delhi"));
     list.add(new Student(2,"Ashima","Palwal"));
     list.add(new Student(3,"Chhavi","Delhi"));
     list.add(new Student(4,"Khyati","Noida"));
     
    while(true){
        System.out.println("\nSelect any one option :");
        System.out.println("----------------------");
        System.out.println("1. Add Students");
        System.out.println("2. List All Students");
        System.out.println("3. Search For Student");
        System.out.println("4. Delete Student Information");
        System.out.println("5. Update Information");
        System.out.println("6. New Update");
        System.out.println("7. Exit");
        
        System.out.print("\nEnter Your choice : ");
        int option=sc.nextInt();
        
        switch(option){
            case 1 : 
                System.out.print("Enter roll no. : ");
                int rollno=sc.nextInt();
                System.out.print("Enter Name : ");
                sc.nextLine();
                String name=sc.nextLine();
                System.out.print("Enter City : ");
                String city=sc.nextLine();
                
                list.add(new Student(rollno,name,city));
                System.out.println("\nRecord added to the list...!!!");
                break;
                
            case 2 :
                for(Student s:list)
                  System.out.println(s);
                break;
            
            case 3 :
                System.out.print("Enter rollno to search : ");
                rollno=sc.nextInt();
                boolean found=false;
                
                for(Student s : list){
                    if(s.getRollno()==rollno){
                        found=true;
                        System.out.println("Rollno : "+s.getRollno());
                        System.out.println("Name : "+s.getName());
                        System.out.println("City : "+s.getCity());
                    }
                }
                if(!found)
                    System.out.println("\nRecord not found...!!!");
                break;
                
            case 4 :
                System.out.print("Enter rollno to delete : ");
                rollno=sc.nextInt();
                found=false;
                
                for(Student s :list){
                    if(s.getRollno()==rollno){
                        found=true;
                        list.remove(s);
                        System.out.println("\nRecord deleted...!!");
                    }
                }
                
                if(!found)
                    System.out.println("\nRecord does not exist...!!!");
                break;
                
            case 5 :
                System.out.print("Enter rollno to be updated : ");
                rollno=sc.nextInt();
                found=false;
                int index=-1;
                
                for(int i=0;i<list.size();i++){
                    if(list.get(i).getRollno()==rollno){
                        found =true;
                        index=i;
                        System.out.print("Enter new name : ");
                        sc.nextLine();
                        name=sc.nextLine();
                        System.out.print("Enter new city : ");
                        city=sc.nextLine();
                        list.remove(index);
                        list.add(index,new Student(rollno,name,city));
                        System.out.println("Record updated...!!!");
                    }
                }
                if(!found)
                    System.out.println("Record does not exist...!!!");
                    break;
                    
            case 6 :
                System.out.print("Enter rollno to update : ");
                rollno=sc.nextInt();
                found=false;
                
                for(Student s : list){
                    if(s.getRollno()==rollno){
                        found =true;
                        System.out.print("Enter new name : ");
                        sc.nextLine();
                        name=sc.nextLine();
                        System.out.println("Enter new city : ");
                        city=sc.nextLine();
                        s.setName(name);
                        s.setCity(city);
                        System.out.println("Record updated...!!!");
                    }
                }
                if(!found)
                    System.out.println("Record does not exist...!!!");
                    break;
                    
                
            case 7 :
                return;
               
            default:
                System.out.println("Invalid Choice...!!!");
        
        }
    }
  }
}
 
