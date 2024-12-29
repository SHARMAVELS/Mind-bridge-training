import java.util.*;
class Factorial 
{
    public static void main(String args[])
    {
        int fact=6;
        int mul=1;
        for(int i=fact;i>0;i--)
        {
            mul*=i;
        }
        System.out.print(mul);
    }
}