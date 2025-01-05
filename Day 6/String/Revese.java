import java.util.*;
class Main
{
    public static void main (String[] args) {
        String str="hello everyone i am John";
        char[] ch=str.toCharArray();
        int n=ch.length;
        for(int i=n-1;i>=0;i--)
        {
            if(ch[i]=='a' || ch[i]=='e' ||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
            {
                System.out.print("*");
            }
            else{
            System.out.print(ch[i]);}
        }
    }
}