
public class Catalog {
    private String collname;
    private String type;
    private String title;
    private float price;
    private int id;
    private int year;
    
    Catalog(String collname,String type,String title,float price,int id,int year){
        this.collname=collname;
        this.type=type;
        this.title=title;
        this.price=price;
        this.id=id;
        this.year=year;
    }
    
    public String toString(){
        return String.format("| %-15s | %-15s | %-15s | %7f | %6d | %5d |", 
                              getCollname(), getType(), getTitle(), getPrice(),
                              getId(), getYear());
                            
    }

   
    public String getCollname() {
        return collname;
    }

    public void setCollname(String collname) {
        this.collname = collname;
    }

    
    public String getType() {
        return type;
    }

   
    public void setType(String type) {
        this.type = type;
    }

    
    public String getTitle() {
        return title;
    }

    
    public void setTitle(String title) {
        this.title = title;
    }

   
    public float getPrice() {
        return price;
    }

   
    public void setPrice(float price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    
    public void setId(int id) {
        this.id = id;
    }

   
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
