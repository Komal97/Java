
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;

public class Program {
    public static void main(String[] arg){
        
        LocalDate ld=LocalDate.of(2016,8,1);
        LocalDate ld1=ld.plusYears(4);
        System.out.println(ld);
        System.out.println(ld1);
     
     LocalDate today=LocalDate.now();
     LocalDate birthday=LocalDate.of(1997, Month.JANUARY, 22);
     
     Period p=Period.between(birthday, today);
        System.out.println("You are "+p.getYears()+
                           " years "+p.getMonths()+
                           " months "+p.getDays()+" days");
      
    }
}
