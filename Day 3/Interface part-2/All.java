import java.util.*;
interface Printer
{
    void print();
}
interface Scan
{
    void scan();
}
class Allinone implements Printer,Scan{
   public  void print()
    {
        System.out.println("printing");
        
    }
   public  void scan()
    {
        System.out.println("scanning");
    }
}
class All
{
    public static void main(String args[])
    {
        Allinone all=new Allinone();
        all.print();
        all.scan();
    }
}