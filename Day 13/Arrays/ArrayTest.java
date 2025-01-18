package Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class ArrayTest {
    @Test
    void p()
    {
        int[] crr={4,3,2,1};
        int[] brr={1,2,3,4};
        Assertions.assertArrayEquals(brr,Arraysort.arr(crr));
    }
    @Test
    void pp()
    {
        int[] vrr={};
        Assertions.assertEquals(vrr,Arraysort.arr(vrr));

    }
}
