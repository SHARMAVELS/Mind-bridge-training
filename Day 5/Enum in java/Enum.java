import java.util.*;
class Enum
{
    enum day
    {
        Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday;
    }
    public static void main (String[] args) {
        find(day.Monday);
        find(day.Saturday);
        
    }
    public static void find(day Day)
    {
        switch(Day)
        {
            case Monday:
                System.out.println("its weekday");
                break;
            case Tuesday:
                 System.out.println("its weekday");
                break;
            case Wednesday:
                 System.out.println("its weekday");
                break;
            case Thursday:
                 System.out.println("its weekday");
                break;
            case Friday:
                 System.out.println("its weekday");
                break;
            case Saturday:
                 System.out.println("its weekend");
                break;
            case Sunday:
                 System.out.println("its weekend");
                break;
                
        }
    }
}