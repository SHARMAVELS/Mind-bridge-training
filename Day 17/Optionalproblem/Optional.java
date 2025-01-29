
import java.util.Optional;
public class OptionalDefault {
    public static void main(String[] args) {
       
 String name = null;
           String res = Optional.ofNullable(name).orElse("guest");
        System.out.println("Default value : "+res);
    }
}