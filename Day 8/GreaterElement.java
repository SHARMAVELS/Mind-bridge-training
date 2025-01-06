import java.util.*;
class Main{
    

 public static void main (String[] args) {
    Scanner sc=new Scanner(System.in);
   int a= sc.nextInt();
   int[] arr=new int[a];
   for(int i=0;i<a;i++)
   {
       arr[i]=sc.nextInt();
   }
   ////////////////////////////////
   for(int j=0;j<a;j++)
   {
           if(j==a-1)
           {
               System.out.print("-1");
               break;
           }
       for(int k=j+1;k<a;k++)
       {
           if(arr[j]<arr[k])
           {
               System.out.print(arr[k]+" ");
               break;
           }
       }
   }
}
}