import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Vector<Integer> li=new Vector<>();
        while(true)
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter 1 to add item");
            System.out.println("Enter 2 to print high");
            System.out.println("Enter 3 to print low");
            System.out.println("Enter 4 to print average");
                        System.out.println("Enter 5 to return");

            
            int a=sc.nextInt();
            switch(a)
            {
                case 1:
                    System.out.println("add Mark");
                    int str=sc.nextInt();
                    li.add(str);
                    break;
            case 2:
                     System.out.println("Get High Grade");
                     int high=li.stream().max(Integer::compare).orElse(0);
                    System.out.println(high);
                    break;
            case 3:
                    System.out.println("Get Low Grade");
                    int low=li.stream().min(Integer::compare).orElse(0);
                    System.out.print(low);
                    break;
                    
            case 4:
                   System.out.println("Average");
                   double avg=li.stream().mapToInt(x->x).average().orElse(0.0);
                   System.out.print(avg);
                   break;
            case 5:
                return;
            }
        }
    }
}