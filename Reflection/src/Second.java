//invoking methods and objects through object 

import java.lang.reflect.*;

public class Second {
    public static void main(String[] args) throws Exception{
        
        Class cls=Student.class;
        
        //object creation
        
        Object obj=cls.newInstance();        //creates a new instance of class
                                             //represented by this class object
        Method mymethod=cls.getMethod("Name",new Class[]{});
        
        mymethod.invoke(obj,null);
        
        Method mymethod2=cls.getMethod("PrintMe",new Class[]{String.class}); //returns referance
        mymethod2.invoke(obj,"Aptech computers");                         //invoke through object
        
        Method mymethod3=cls.getMethod("sum", new Class[]{int.class,int.class});
        int result=(int)mymethod3.invoke(obj, 15,35);      //object is converted into int
        System.out.println("Result : "+result);
    }
}
