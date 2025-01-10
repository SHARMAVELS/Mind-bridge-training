import java.util.*;
class Votes implements Runnable
{
    String canditate;
    
    public Votes(String canditate)
    {
        this.canditate=canditate;
    }
    
    public void run()
    {
                    Main.vote.merge(canditate, 1, Integer::sum);

    }
}
class Main
{
        public static final ConcurrentMap<String,Integer> vote=new ConcurrentHashMap<String,Integer>();
    public static void main(String args[])
    {
        Thread t1=new Thread(new Votes("arun"));
        Thread t2=new Thread(new Votes("bob"));
        Thread t3=new Thread(new Votes("max"));
        Thread t4=new Thread(new Votes("balu"));
        
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        
        t1.join();
        t2.join();
        t3.join();
        t4.join();
        
        System.out.print("Vote Count");
        for(String str:vote.keyset())
        {
            System.out.print(vote.get(str));
        }



        
    }
}