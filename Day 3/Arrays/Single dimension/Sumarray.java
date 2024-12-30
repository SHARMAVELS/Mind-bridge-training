import java.util.*;
class Sumarray
{
    public static void main(String args[])
    {
        int[] arr={10,11,45,53};
    int n=arr.length;
    int sum=0;
    for(int i=0;i<n;i++)
    {
       sum+=arr[i];
    }
    System.out.println(sum);
    }
}