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
       ////////// //////////////////////////////////////////////////////
        
        Arrays.sort(arr);
        int n=arr[a-1];
        int co=0;
        for(int j=0;j<=n;j++)
        {
            for(int k=0;k<a;k++)
            {
                if(j==arr[k])
                {
                  co++;  
                }
            }
            if(co==0)
            {
                System.out.print(j);
            }
            co=0;
        }
        
        
        
        
    }
}