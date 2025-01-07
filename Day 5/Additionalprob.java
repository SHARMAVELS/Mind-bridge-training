import java.util.*;
class Containers<T >
{
    T obj;
    Containers(T ob)
    {
    this.obj=ob;
    }
    public void dis()
    {
        System.out.println(obj);
    }
}
class Level
{
    enum Priority
    {
        HIGH(3),
        MEDIUM(2),
        LOW(1);
        
        private int vari;
        Priority(int i)
        {
        this.vari=i;
        }
        
        public void display()
        {
            System.out.print(vari);
        }
    }
}
class Main
{
    public static void main (String[] args) {
        
        Containers<Integer> co=new Containers<>(5);
        co.dis();
       Level.Priority p=Level.Priority.HIGH;
        p.display();
    }
}