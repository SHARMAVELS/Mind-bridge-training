package Factorial;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class FacCheck {
    @Test
    void pp()
    {
        Assertions.assertEquals(0,Factorial.fac(0));
    }
    @Test
    void p()
    {
        Assertions.assertEquals(0,Factorial.fac(-4));
    }
   
}
