import java.util.*;
class Main
{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int[] arr=new int[a];
        for(int i=0;i<a;i++)
        {
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        List<Integer> li=new ArrayList<>();
        int sum=0;
        for(int i=0;i<a;i++)
        {
            for(int j=i;j<a;j++)
            {
                for(int h=i;h<=j;h++)
                {
                    sum+=arr[h];
                    
                }
                           // System.out.print(sum);

            if(sum==k)
            {
                for(int l=j;l>=0;l--)
                {
                    li.add(l);
                }
            }
            sum=0;
            }
        }
        System.out.print(li);
    }
}