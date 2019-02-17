class Employee{
     
    private int empid;
     private String name;
     private String designation;
     
     public void Input(int ei,String nm,String desig){
          empid=ei;
          name=nm;
          designation=desig;
      }
             
     public void Output(){
         System.out.println("Employee id :"+empid);
         System.out.println("Employee name :"+name);
         System.out.println("Employee designation :"+designation);
     }  
}

class Program {
     public static void main(String[] args) {
        
        Employee emp=new Employee();
        
        emp.Input(10, "Raj","Manager");
        emp.Output();
        
    }
}
