import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Map<String,Integer> li=new HashMap<>();
        System.out.println("Add name and Grade");
        String str=sc.next();
        int st=sc.nextInt();
                System.out.println("Add  name and Grade");

        String str1=sc.next();
        int st1=sc.nextInt();
                System.out.println("Add name and Grade");
        String str2=sc.next();
        int st2=sc.nextInt();
        
        li.put(str,st);
        li.put(str1,st1);
        li.put(str2,st2);
        System.out.println("Enter name to Update Grade ");
        String str3=sc.next();
        if(li.containsKey(str3))
        {
            System.out.println("Enter new Grade");
        int st3=sc.nextInt();
        li.put(str3,st3);
        }
        
        int n=li.size();
        System.out.println("All Students and grades::");
        for (Map.Entry<String, Integer> entry : li.entrySet()) {
                            System.out.println(entry.getKey() + ": " + entry.getValue());
    }
    }}
