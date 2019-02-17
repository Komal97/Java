package bodmas.calculation;

import java.util.ArrayList;

public class BODMASCalculation {

    public static void main(String[] args) {
        // TODO code application logic here
        String exp="25.5x3-5.3+4";
        
        ArrayList<Float> numlist=new ArrayList<>();
        for(String n:exp.split("[^0-9.]"))
            numlist.add(Float.parseFloat(n));
        
        ArrayList<String> oplist=new ArrayList<>();
        for(String o:exp.split("[0-9.]"))
           if(!o.equals(""))
               oplist.add(o);
        
        System.out.println(numlist);
        System.out.println(oplist);
     
        int index;
        float n1,n2,result;
        
        while(oplist.size()!=0){
         if(oplist.contains("/")){
             index=oplist.indexOf("/");
             n1=numlist.get(index);
             n2=numlist.get(index+1);
             result=n1/n2;
             oplist.remove(index);
             numlist.remove(index+1);
             numlist.set(index,result);
         }  
         else if(oplist.contains("x")){
             index=oplist.indexOf("x");
             n1=numlist.get(index);
             n2=numlist.get(index+1);
             result=n1*n2;
             oplist.remove(index);
             numlist.remove(index+1);
             numlist.set(index,result);
         }
         else if(oplist.contains("+")){
             index=oplist.indexOf("+");
             n1=numlist.get(index);
             n2=numlist.get(index+1);
             result=n1+n2;
             oplist.remove(index);
             numlist.remove(index+1);
             numlist.set(index,result);
         }
         else{
             index=oplist.indexOf("-");
             n1=numlist.get(index);
             n2=numlist.get(index+1);
             result=n1-n2;
             oplist.remove(index);
             numlist.remove(index+1);
             numlist.set(index,result);
         }
        }
        System.out.println("Result : "+numlist.get(0));
    }
}
