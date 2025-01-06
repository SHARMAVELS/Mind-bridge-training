import java.util.*;
class Main
{
    public static void main (String[] args) {
        String[] str={"a","abc","ab","d" };
        String word="abc";
        String st="";
        int co=0;
        
        for(int i=0;i<3;i++)
        {
            int n=str[i].length();
            for(int j=0;j<n;j++)
            {
                if(word.charAt(i)==str[i].charAt(j))
                {
                    st+=word.charAt(i);
                    co++;
                }
            }
                if(co>0)
                {
                    System.out.println(st+" appears as a substring in abc");
                }
                
        }
    }
}