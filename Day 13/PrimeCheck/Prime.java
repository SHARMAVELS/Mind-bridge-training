package PrimeCheck;
import java.util.*;
public class Prime {
    public boolean st(int n)
    {
        int co=0;
        if(n==1)
        {
            return true;
        }
        else if (n<0)
        {
            return false;
        }
        for(int i=2;i<n;i++)
        {
            if(i%n==0)
            {
                co++;
            }
        }
        if(co==1)
        {
          return true;
        }
        return false;
    }
}
