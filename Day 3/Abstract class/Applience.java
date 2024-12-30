import java.util.*;
abstract class Applience
{
    abstract void turnon();
    
    void turnof()
    {
        System.out.println("Applience are off");
    }
}
class Fan extends Applience
{
 void turnon()
 {
     System.out.println("Fan is On");
 }
}
class Appliance
{
    public static void main(String args[])
    {
        Fan f=new Fan();
        f.turnon();
        f.turnof();
    }
}