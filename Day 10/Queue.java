import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Queue<String> qu=new LinkedList<>();
        System.out.println("Add customer");
        String st1=sc.next();
        qu.add(st1);
                System.out.println("Add customer");

         String st2=sc.next();
        qu.add(st2);
                System.out.println("Add customer");

         String st3=sc.next();
        qu.add(st3);
                System.out.println("Served Customer");
                
                        System.out.println(qu.poll());
                        
                                System.out.println("Waiting");
                                        System.out.print(qu);




        
    }
}