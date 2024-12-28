import java.util.*;
class Relationoperator
{
    public static void main(String args[])
    {

        int a=10;
        int b=5;

        if(a>b)
        {
            System.out.println("its greater");
        }
        else if (a==b) {
            System.out.println("its equal");
        }
        else {
            System.out.println("its not greater");
        }

        if(a>b && b<a)
        {
            System.out.println("its greater in logical");
        }
        else if(a>b || b<a)
        {
            System.out.println("its greater in logical");
        }
        if(!(a>b)){
            System.out.println("its not greater");
        }
    }
}