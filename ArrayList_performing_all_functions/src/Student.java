class Student {
    private int rollno;
    private String name;
    private String city;
    
    Student(int rollno,String name,String city){
        this.rollno=rollno;
        this.name=name;
        this.city=city;
    }
    
    public String toString(){
        //return "Roll No. : "+getRollno+"\n"+"Name :"+getName+"\n"+"City :"+getCity+"\n";
        return String.format("| %7d | %-15s | %-15s |", getRollno(), getName(), getCity());
    }

    public int getRollno() {                            //getter
        return rollno;
    }

    
    public String getName() {                           //getter
        return name;
    }

    public String getCity() {                           //getter
        return city;                             
    }
    
    public void setName(String name) {                  //setter
        this.name = name;
    }

    public void setCity(String city) {                  //setter
        this.city = city;
    }
}

