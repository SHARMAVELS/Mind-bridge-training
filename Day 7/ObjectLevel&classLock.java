import java.util.*;
class SharedPrinter
{
    public synchronized void strone(String st,int co)
    {
        for(int i=0;i<co;i++)
        {
            System.out.println(st);
            try {
                Thread.sleep(100);
            } catch(Exception e) {
                e.printStackTrace();
            }
        }
    }
    public synchronized void countone(int num)
    {
        for(int i=num;i>=0;i--)
        {
            System.out.println(i);
            try {
                Thread.sleep(100);
            } catch(Exception e) {
                e.printStackTrace();
            }
        }
    }
    public static synchronized void strtwo(String st,int co)
    {
        for(int i=0;i<co;i++)
        {
            System.out.println(st);
            try {
                Thread.sleep(100);
            } catch(Exception e) {
                e.printStackTrace();
            }
        }
        
    }
    
    public static synchronized void counttwo(int num)
    {
        for(int i=num;i>=0;i--)
        {
            System.out.println(i);
            try {
                Thread.sleep(100);
            } catch(Exception e) {
                e.printStackTrace();
            }
        }
    }
}
class Main
{
    public static void main (String[] args) {
        SharedPrinter sp=new SharedPrinter();
        
        Thread t1=new Thread(()->sp.strone("hi",5));
                Thread t2=new Thread(()->sp.countone(5));
                
  t1.start();
  t2.start();
  
  Thread t3=new Thread(()->SharedPrinter.strtwo("hello",8));
    Thread t4=new Thread(()->SharedPrinter.counttwo(8));
    t3.start();
    t4.start();

    }
}