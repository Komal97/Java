class Nokia{
    void call(){
        System.out.println("Calling from mobile");
    }
    
    void message(){
        System.out.println("SMS from mobile");
    }
}

class Android extends Nokia{
    void call(){
        System.out.println("Call with photo");
    }
    
    void videoCall(){
        System.out.println("Video calling ");
    }
    
    void camera (){
        System.out.println("Camera App ");
    }
}

class Program {
    public static void main(String[] args) {
       Android an=new Android();
       an.call();
       an.videoCall();
       an.camera();
    }
    
}
