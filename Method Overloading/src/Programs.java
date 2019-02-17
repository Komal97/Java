class Functions{
    
    void multiply(int a,int b){
        System.out.println("Multiplication : "+(a*b));
    }
    
    void multiply(int a,int b,int c ){
        System.out.println("Multiplication : "+(a*b*c));
    }
    
    void multiply(float a,float b){
        System.out.println("Multiplication : "+(a*b));
    }
    
    void multiply(int... a){
        int s=1;
        for(int n:a)
            s*=n;
        System.out.println("Multiplicaion : "+s);
     }
}

class Programs {
    public static void main(String[] args) {
        
        Functions fun=new Functions();
        fun.multiply(2.3f, 3.4f);
        fun.multiply(1,3);
        fun.multiply(2, 1, 4);
        fun.multiply(1,5,4,6,2);
    }
    
}
