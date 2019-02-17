//program to list out

import java.lang.reflect.*;

public class Program {
    public static void main(String[] args) {
        // TODO code application logic here
        
        /* "Class" is a name of class and we dont make object of class student 
           bcoz on object creation ,it will automatically invoke default constructor
           so instead we take the referance of class Student by loading it into class
        */
        
        Class cls=Student.class;
        //Class cls=Class.forName("Student");
        
     // Method mlist[]=cls.getMethods();   //returns an array contain method objects
                                            //reflects all the methods(array) of class 
                                            //or interface represented by this class object
                                            
        Method mlist[]=cls.getDeclaredMethods();      //reflects all declared method objects
        
        for(Method method : mlist){
            System.out.println("Name : "+method.getName());
            System.out.println("Return Type : "+method.getReturnType());
            System.out.println("No. of arguments : "+method.getParameterCount());   //return int 
            System.out.println("-----------------------------------------------------------------");
        }
        
        Field flist[]=cls.getDeclaredFields();  // returns an array containing field objects 
                                                //reflecting all accessible public deaclared fields of 
                                                //class or interface represented by this class object
        
        for(Field field : flist){
            System.out.println("Name : "+field.getName());
            System.out.println("Data Type : "+field.getType());
            System.out.println("Class : "+field.getDeclaringClass());
            System.out.println("-----------------------------------------------------------------");
        }
    }
 }
