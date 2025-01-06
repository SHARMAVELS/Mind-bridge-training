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
        
        ////////////////////////////////////////////////////
        
        int[] brr=new int[a];
        int f=a-k;
        int e=0;
        for(int j=f;j<a;j++)
        {
            brr[e]=arr[j];
            e++;
        }
        for(int h=0;h<f;h++)
        {
            brr[e]=arr[h];
            e++;
        }
        
        for(int d=0;d<a;d++)
        {
            System.out.print(brr[d]);
        }
        
    }
}