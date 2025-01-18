package PrimeCheck;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Primetest {
    Prime p=new Prime();
    @Test
    void p()
    {
        Assertions.assertTrue(p.st(1));
    }
    @Test
    void pp()
    {
        Assertions.assertFalse(p.st(-3));
    }
    @Test
    void ppp()
    {
        Assertions.assertFalse(p.st(1009));
    }
}
