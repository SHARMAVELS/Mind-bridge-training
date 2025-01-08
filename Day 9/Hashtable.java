import java.util.*;
class Main
{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        Hashtable<String,String> h=new Hashtable<>();
        h.put("john","1234");
        h.put("babu","4321");
        System.out.println("Enter name to search");
        String str1=sc.next();
        System.out.println("Search result"+h.get(str1));
        System.out.println("Enter name to Remove");
        String str2=sc.next();
        h.remove(str2);
        System.out.print("After Removal");
        Set<String> keys = h.keySet(); // Get all keys
    for (String key : keys) {
    System.out.println("Name: " + key + ", Phone: " + h.get(key));
}
        
        
    }
}