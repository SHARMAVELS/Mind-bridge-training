import java.util.*;
class Num extends Thread
{
    public void run()
    {
    
        try{
        for(int i=1;i<=10;i++)
        {
            System.out.println(i);
            Thread.sleep(500);
        }
        }
        catch(InterruptedException e)
        {
            System.out.print("Number InterruptedException"+e.getMessage());
        }
    
    }
}
class Squar extends Thread
{
    public void run()
    {
    
        try{
        for(int i=1;i<=10;i++)
        {
            System.out.println(i*i);
            Thread.sleep(700);
        }
        }
        catch(InterruptedException e)
        {
            System.out.print("Square InterruptedException"+e.getMessage());
        }
    
    }
}
class ThreadIntro
{
    public static void main (String[] args) {
        Thread n=new Num();
        Thread s=new Squar();
        n.start();
        s.start();
        try {
            n.join();
            s.join();
        } 
        catch(InterruptedException e) {
            System.out.print("InterruptedException"+e.getMessage());
        }
    }
}