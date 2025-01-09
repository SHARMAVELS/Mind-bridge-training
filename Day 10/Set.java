import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Set<String> li=new HashSet<>();
        System.out.println("Add name");
        String str=sc.nextLine();
                System.out.println("Add  name");

        String str1=sc.nextLine();
                System.out.println("Add name");

        String str2=sc.nextLine();
        
        li.add(str);
        li.add(str1);
        li.add(str2);
        System.out.println("search Task ");
        String str3=sc.nextLine();
        if(li.contains(str3))
        {
            System.out.println("Name is inside the List");
        }
        
        int n=li.size();
        System.out.println("List::");
        for(int i=0;i<1;i++)
        {
            System.out.println(li);
        }
    }
}