import java.util.*;
class Main
{
    public static void main(String args[])
    {
        ArrayList<String> li=new ArrayList<>();
        while(true)
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter 1 to add item");
            System.out.println("Enter 2 to delete item");
            System.out.println("Enter 3 to print list");
            int a=sc.nextInt();
            switch(a)
            {
                case 1:
                    System.out.println("add item");
                    String str=sc.next();
                    li.add(str);
                    break;
            case 2:
                     System.out.println("delete item");
                    String str1=sc.next();
                    li.remove(str1);
                    break;
            case 3:
                    System.out.println("List");
                    System.out.print(li);
                    return;
            }
        }
    }
}