import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        LinkedList<String> li=new LinkedList<>();
        System.out.println("Add Task");
        String str=sc.nextLine();
                System.out.println("Add Task");

        String str1=sc.nextLine();
                System.out.println("Add Task");

        String str2=sc.nextLine();
        
        li.add(str);
        li.add(str1);
        li.add(str2);
        System.out.println("Remove Task ");
        String str3=sc.nextLine();
        li.remove(str3);
        
        int n=li.size();
        System.out.println("List::");
        for(int i=0;i<n;i++)
        {
            System.out.println(li.get(i));
        }
    }
}