

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Objects;
import java.util.function.Supplier;

public class SimpleSup {
    public static void main(String[] args) {
   Supplier<Object> supplier =  ()->{
     Calendar calendar = Calendar.getInstance();
     return  calendar.getTime();
        };
    System.out.println(supplier.get());
    }
}
