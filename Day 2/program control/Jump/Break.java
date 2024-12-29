import java.util.*;
class Break
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

    while(true)
    {
        int a=sc.nextInt();
        if(a==0)
        {
            break;
        }
        System.out.println("The number is :"+a);
    }
    }
}