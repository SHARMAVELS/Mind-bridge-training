package Palindrome;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class PaliTest {
    Palindrome pa=new Palindrome();
    @Test
    void pa()
    {
        Assertions.assertTrue(pa.rev("madam"));
    }
    @Test
    void p()
    {
        Assertions.assertTrue(pa.rev("madam"));
    }
    @Test
    void pp()
    {
        Assertions.assertFalse(pa.rev("Madam"));
    }
}
