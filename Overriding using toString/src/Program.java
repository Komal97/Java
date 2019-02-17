class Employee{
    private int empid;
    String name;
    
    Employee(int empid,String name){
        this.empid=empid;
        this.name=name;
    }
    
    public String toString(){
        //return "Employee Id : "+empid+"\n"+"Employee Name : "+name+"\n";
        return String.format("%d,%s",empid,name);
    }
}
class Program {
    public static void main(String[] args) {
        Employee emp=new Employee(101,"Komal");
        System.out.println(emp);
        System.out.println(new Employee(201,"Chhavi"));
        
    }
    
}
