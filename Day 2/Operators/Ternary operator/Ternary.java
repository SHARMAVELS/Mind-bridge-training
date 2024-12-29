import java.util.*;
class Ternary
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        
        int large=(a>b)?a:b;
        int la=(large>c)?large:c;
        System.out.print(la);
        
    }
}