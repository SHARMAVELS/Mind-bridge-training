import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        
        System.out.println(Math.pow(a,b));
        System.out.println(Math.sqrt(a));
        System.out.println(Math.max(a,b));
        sc.nextLine();
        String str=sc.nextLine();
        System.out.println(str.length());
        System.out.println(str.toUpperCase());
        System.out.println(str.substring(1,3));
        
        System.out.print(System.currentTimeMillis());
        
    }
}