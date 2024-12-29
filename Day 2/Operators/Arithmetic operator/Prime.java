import java.util.*;
class Prime
{
    public static void main(String args[])
    {
       int n=7;
       int count=0;
       for(int i=1;i<n;i++)
       {
           if(n%i==0)
           {
               count++;
           }
       }
       if(count==0||count==1)
       {
           System.out.print("its a prime");
       }
       if(count>1)
       {
           System.out.print("its not a prime");
       }
    }
}