import java.util.*;
class Main
{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> li=new ArrayList<>();
        int n=sc.nextInt();
        int min=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
        int a=sc.nextInt();
          li.add(a);  
        }
        for(int j=n-1;j>=0;j--)
        {
           // System.out.print(li.get(j));
            if(min<li.get(j))
            {
                min=li.get(j);
            }
        }
        System.out.print(min);
    }
}