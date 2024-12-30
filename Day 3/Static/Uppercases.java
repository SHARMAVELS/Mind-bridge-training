import java.util.*;
class Upper
{
    static void Uppercase()
    {
        String str="hello";
       str= str.toUpperCase();
        System.out.print(str);
    }
}
class Uppercases
{
    public static void main(String s[])
    {
        Upper up=new Upper();
        up.Uppercase();
    }
}