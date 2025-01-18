package Factorial;
import java.util.*;

public class Factorial {

    public static int fac(int n)
    {
        int sr=1;
     if(n==0 || n<0)
     {
         return 0;
     }

        for(int i=1;i<n;i++)
        {
            sr*=i;
        }
        return sr;
    }
}
