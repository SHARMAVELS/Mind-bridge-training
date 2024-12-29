import java.util.*;
class Ones
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        String bin=Integer.toBinaryString(a);
        int n=bin.length();
        int co=0;
        for(int i=0;i<n;i++)
        {
            if(bin.charAt(i)=='1')
            {
                co++;
            }
        }
        System.out.print(co);
    }
}