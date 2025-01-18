package STR;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public  class Strtest {
Stringre strr=new Stringre();
@Test
    public   void check()
{
    Assertions.assertEquals("null",strr.rev(null));


}
 @Test
         public void si()
 {
         Assertions.assertEquals("e",strr.rev("e"));}
    @Test
    void sc()
    {
        Assertions.assertEquals("@#!",strr.rev("!#@"));
    }

}
