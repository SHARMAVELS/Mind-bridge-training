import java.util.*;

class Main
{
    public static void main (String[] args) {
        String str1="Arun";
        String str2="Balu";
        int compare=str1.compareTo(str2);
        if(compare<0)
        {
            System.out.println("str1 is comes first");
        }
        else
        {
            System.out.println("Str2 comes first");
        }
        
        System.out.println(str1.equals(str2));
        
        System.out.print(str1+str2);
        
        }
    }
